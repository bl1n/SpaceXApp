package com.lft.spacex.ui.Images;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.R;
import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.RefreshOwner;
import com.lft.spacex.common.Refreshable;
import com.lft.spacex.data.model.LaunchImage;

import java.util.List;

import javax.inject.Inject;

public class ImagesFragment extends PresenterFragment<ImagesPresenter> implements ImagesView, Refreshable {


    private static final String TAG = "Debug";

    private RecyclerView mRecyclerView;
    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private ImageView mImageView;
    private ImagesAdapter mAdapter;

    @Inject
    ImagesPresenter mPresenter;

    public static ImagesFragment newInstance() {
        Bundle args = new Bundle();
        ImagesFragment fragment = new ImagesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public ImagesPresenter getPresenter() {
        return mPresenter;
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
            getActivity().setTitle("Images");
        }
        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        mAdapter = new ImagesAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        onRefreshData();
    }

    @Override
    public void onRefreshData() {
        mPresenter.getImages();
    }

    @Override
    public void showImages(List<LaunchImage> images) {
        mErrorView.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.VISIBLE);
        mAdapter.addData(images,true);
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
    }
}
