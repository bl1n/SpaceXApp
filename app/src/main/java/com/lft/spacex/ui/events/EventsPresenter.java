package com.lft.spacex.ui.events;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.SpaceXApi;
import com.lft.spacex.model.histories.HistoryEvent;
import com.lft.spacex.model.histories.SpaceXHistoryResponse;

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
                                response -> {
                                    mView.showHistories(response);
                                }
                                )



        );
    }

    public void openEvent(int id){
        mView.openEvent(id);
    }
}
