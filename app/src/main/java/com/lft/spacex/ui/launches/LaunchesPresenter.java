package com.lft.spacex.ui.launches;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.SpaceXApi;
import com.lft.spacex.model.launches.LaunchesResponse;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LaunchesPresenter extends BasePresenter {

    private static final String TAG = "Debug";

    private LaunchesView mView;

    @Inject
    SpaceXApi mApi;

    @Inject
    public LaunchesPresenter() {
    }

    public void setView(LaunchesView view) {
        mView = view;
    }


    public void getLaunches() {
        mCompositeDisposable.add(
                mApi.getLaunches()
                        .subscribeOn(Schedulers.io())
                        .onErrorReturn(throwable -> {
                            Log.d(TAG, "getLaunches: error " + throwable.getMessage());
                            return new ArrayList<>();
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable -> mView.showRefresh())
                        .doFinally(mView::hideRefresh)
                        .subscribe(launchesResponse -> {
                                    mView.showLaunches(launchesResponse);
                                    Log.d(TAG, "getLaunches: " + launchesResponse.size());
                                },
                                throwable ->{
                                    Log.d(TAG, "getLaunches: subscribeError" + throwable.getMessage());
                                })
        );
    }

    public void openLaunch(int id){
        mView.openLaunch(id);
    }
}
