package com.lft.spacex.ui.launches.launch;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.R;
import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.RefreshOwner;
import com.lft.spacex.common.Refreshable;
import com.lft.spacex.data.model.launches.Launch;
import com.squareup.picasso.Picasso;

import java.util.List;

import javax.inject.Inject;

public class LaunchFragment extends PresenterFragment<LaunchPresenter>
        implements Refreshable, LaunchView {

    public static final String FLIGHT_NUMBER = "FLIGHT_NUMBER";
    public static final String ARGS = "ARGS";
    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private LinearLayout mLinearLayout;
    private int mFlightNumber;
    private TextView mLFlightDetails;


    @Inject
    LaunchPresenter mPresenter;

    public static LaunchFragment newInstance(Bundle args) {
        LaunchFragment fragment = new LaunchFragment();
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
        return inflater.inflate(R.layout.fr_launch_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mErrorView = view.findViewById(R.id.errorView);
        mLinearLayout = view.findViewById(R.id.ld_group);
        mLFlightDetails = view.findViewById(R.id.tv_ld_details);

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setTitle("Launches");
        }
        if(getArguments() !=null){
            mFlightNumber = getArguments().getInt(FLIGHT_NUMBER);
            Log.d(LaunchPresenter.TAG, "onActivityCreated: " + mFlightNumber);
        }
        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        onRefreshData();
    }



    @Override
    public void onRefreshData() {
        mPresenter.getLaunch(mFlightNumber);
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
    protected LaunchPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void showLaunch(Launch launch) {
        getActivity().setTitle(launch.getMissionName());
        mLFlightDetails.setText(launch.getDetails());
        final List<String> flickrImages = launch.getLinks().getFlickrImages();
        // TODO: 28.06.2019 add RecycleView or ListView for scrolling images


        /*if(flickrImages.size()>1){
            Log.d("Debug", "showLaunch: " + launch.getLinks().getFlickrImages().size());
            ImageView imageView = new ImageView(mLFlightDetails.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            mLinearLayout.addView(imageView);
            Picasso.get().load(flickrImages.get(0)).into(imageView);
        }*/

    }
}
