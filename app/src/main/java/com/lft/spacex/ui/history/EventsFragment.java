package com.lft.spacex.ui.history;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.R;
import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.RefreshOwner;
import com.lft.spacex.common.Refreshable;
import com.lft.spacex.model.histories.HistoryEvent;
import com.lft.spacex.ui.history.event.EventActivity;
import com.lft.spacex.ui.history.event.EventFragment;

import java.util.List;

import javax.inject.Inject;

public class EventsFragment extends PresenterFragment<EventsPresenter>
        implements Refreshable, EventsView, EventsAdapter.OnItemClickListener {

    private RecyclerView mRecyclerView;
    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private EventsAdapter mAdapter;

    @Inject
    EventsPresenter mPresenter;

    public static EventsFragment newInstance() {

        Bundle args = new Bundle();

        EventsFragment fragment = new EventsFragment();
        fragment.setArguments(args);
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
        return inflater.inflate(R.layout.fr_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mRecyclerView = view.findViewById(R.id.recycler);
        mErrorView = view.findViewById(R.id.errorView);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setTitle("History");
        }

        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        mAdapter = new EventsAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mAdapter);

        onRefreshData();
    }

    @Override
    protected EventsPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void onDetach() {
        mRefreshOwner = null;
        super.onDetach();
    }

    @Override
    public void onRefreshData() {
        mPresenter.getHistoryEvents();
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
        mRecyclerView.setVisibility(View.GONE);
    }

    @Override
    public void showHistories(List<HistoryEvent> events) {
        mErrorView.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.VISIBLE);
        mAdapter.addData(events, true);
    }

    @Override
    public void onItemClick(int id) {
        mPresenter.openHistoryEvent(id);
    }

    @Override
    public void openHistoryEvent(int id) {
        Log.d("Debug", "openHistoryEvent: id = " + id);
        Intent intent = new Intent(getActivity(), EventActivity.class);
        Bundle args = new Bundle();
        args.putInt(EventFragment.EVENT_ID, id);
        intent.putExtra(EventFragment.ARGS, args);
        startActivity(intent);
    }
}
