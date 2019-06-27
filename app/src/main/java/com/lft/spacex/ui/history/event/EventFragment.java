package com.lft.spacex.ui.history.event;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.R;
import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.RefreshOwner;
import com.lft.spacex.common.Refreshable;
import com.lft.spacex.model.histories.HistoryEvent;

import javax.inject.Inject;

public class EventFragment extends PresenterFragment<EventPresenter> implements Refreshable, EventView {

    public static final String EVENT_ID = "EVENT_ID";
    public static final String ARGS = "ARGS";
    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private LinearLayout mLinearLayout;
    private TextView mEDTittle;
    private int mEventId;

    @Inject
    EventPresenter mPresenter;

    public static EventFragment newInstance(Bundle bundle) {
        EventFragment fragment = new EventFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof RefreshOwner) {
            mRefreshOwner = ((RefreshOwner) context);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fr_event_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mErrorView = view.findViewById(R.id.errorView);
        mLinearLayout = view.findViewById(R.id.ed_group);
        mEDTittle = view.findViewById(R.id.tv_ed_tittle);

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setTitle("Launches");
        }
        if(getArguments() !=null){
            mEventId = getArguments().getInt(EVENT_ID);
        }
        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        onRefreshData();
    }

    @Override
    public void onRefreshData() {
        mPresenter.getHistoryEvent(mEventId);
    }

    @Override
    public void showRefresh() {
        mRefreshOwner.setRefreshState(true);
    }

    @Override
    public void hideRefresh() {
        mRefreshOwner.setRefreshState(false);
    }

    @Override
    public void showError() {
        mErrorView.setVisibility(View.VISIBLE);
        mLinearLayout.setVisibility(View.GONE);
    }

    @Override
    protected EventPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void showEvent(HistoryEvent event) {
        getActivity().setTitle(event.getTitle());
        mEDTittle.setText(event.getTitle());
    }
}
