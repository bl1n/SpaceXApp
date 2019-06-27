package com.lft.spacex.ui.history.event;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.SpaceXApi;
import com.lft.spacex.model.histories.HistoryEvent;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EventPresenter extends BasePresenter {

    public static final String TAG = "Debug";

    private EventView mView;

    @Inject
    SpaceXApi mApi;

    @Inject
    public EventPresenter() {
    }

    public void setView(EventView view) {
        mView = view;
    }

    public void getHistoryEvent(int id) {
        mCompositeDisposable.add(
                mApi.getHistoryEvent(id)
                        .subscribeOn(Schedulers.io())
                        .onErrorReturn(throwable -> {
                            Log.d(TAG, "getHistoryEvent: onErrorReturn");
                            return new HistoryEvent();
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable -> mView.showRefresh())
                        .doFinally(mView::hideRefresh)
                        .subscribe(
                                event -> mView.showEvent(event),
                                throwable -> Log.d(TAG, "getHistoryEvent: subscribe throwable" + throwable.getMessage()))
        );
    }
}
