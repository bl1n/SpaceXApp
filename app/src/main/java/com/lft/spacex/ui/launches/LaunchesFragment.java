package com.lft.spacex.ui.launches;

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
import com.lft.spacex.data.model.launches.Launch;
import com.lft.spacex.ui.launches.launch.LaunchActivity;
import com.lft.spacex.ui.launches.launch.LaunchFragment;

import java.util.List;

import javax.inject.Inject;

public class LaunchesFragment extends PresenterFragment<LaunchesPresenter>
        implements Refreshable, LaunchesView, LaunchesAdapter.OnItemClickListener {

    private RecyclerView mRecyclerView;
    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private LaunchesAdapter mAdapter;
    @Inject
    LaunchesPresenter mPresenter;

    @Override
    protected LaunchesPresenter getPresenter() {
        return mPresenter;
    }

    public static LaunchesFragment newInstance() {

        Bundle args = new Bundle();

        LaunchesFragment fragment = new LaunchesFragment();
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
            getActivity().setTitle("Launches");
        }
        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        mAdapter = new LaunchesAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        onRefreshData();
    }

    @Override
    public void onRefreshData() {
        mPresenter.getLaunches();
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
    public void showLaunches(@NonNull List<Launch> launches) {
        mErrorView.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.VISIBLE);
        mAdapter.addData(launches, true);
    }

    @Override
    public void openLaunch(@NonNull int id) {
        Log.d("Debug", "openLaunch: id = " + id);
        Intent intent = new Intent(getActivity(), LaunchActivity.class);
        Bundle args = new Bundle();
        args.putInt(LaunchFragment.FLIGHT_NUMBER, id);
        intent.putExtra(LaunchFragment.ARGS, args);
        startActivity(intent);

    }

    @Override
    public void onItemClick(int id) {
        mPresenter.openLaunch(id);
    }

}
