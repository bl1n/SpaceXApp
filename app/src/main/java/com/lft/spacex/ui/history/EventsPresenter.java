package com.lft.spacex.ui.history;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.api.SpaceXApi;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EventsPresenter extends BasePresenter {


    public static final String TAG = "Debug";
    private EventsView mView;
    @Inject
    SpaceXApi mApi;

    @Inject
    public EventsPresenter() {
    }

    public void setView(EventsView view) {
        mView = view;
    }

    public void getHistoryEvents() {

        mCompositeDisposable.add(
                mApi.getHistoryEvents()
                        .subscribeOn(Schedulers.io())
                        .onErrorReturn(throwable -> {
                            Log.d(TAG, "getHistoryEvents: error " + throwable.getMessage());

                            return new ArrayList<>();
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable -> mView.showRefresh())
                        .doFinally(mView::hideRefresh)
                        .subscribe(
                                response -> mView.showHistories(response)
                                )



        );
    }

    public void openHistoryEvent(int id){
        mView.openHistoryEvent(id);
    }
}
