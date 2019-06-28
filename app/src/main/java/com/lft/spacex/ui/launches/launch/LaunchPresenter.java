package com.lft.spacex.ui.launches.launch;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.api.SpaceXApi;
import com.lft.spacex.data.model.launches.Launch;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LaunchPresenter extends BasePresenter {

    public static final String TAG = "Debug";

    @Inject
    SpaceXApi mApi;

    @Inject
    public LaunchPresenter() {
    }

    private LaunchView mView;



    public void getLaunch(int flightNumber) {
        Log.d(TAG, "getLaunch: " + flightNumber);
        mCompositeDisposable.add(
                mApi.getLaunch(flightNumber)
                        .subscribeOn(Schedulers.io())
                        .onErrorReturn(throwable -> {
                            Log.d(TAG, "getLaunch: onError " + throwable.toString());
                            return new Launch();
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable -> mView.showRefresh())
                        .doFinally(mView::hideRefresh)
                        .subscribe(
                                launch -> mView.showLaunch(launch),
                                throwable -> Log.d(TAG, "getLaunch: subscribe error" + throwable.getMessage()))
        );
    }

    public void setView(LaunchView view) {
        mView = view;
    }
}
