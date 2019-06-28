package com.lft.spacex.ui.companyInfo;

import android.util.Log;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.api.SpaceXApi;
import com.lft.spacex.data.model.CompanyInfo;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CompanyInfoPresenter extends BasePresenter {

    private static final String TAG = "Debug";

    private CompanyInfoView mView;

    @Inject
    SpaceXApi mApi;

    @Inject
    public CompanyInfoPresenter() {
    }

    public void setView(CompanyInfoView view) {
        mView = view;
    }

    public void getCompanyInfo() {
        mCompositeDisposable.add(
                mApi.getCompanyInfo()
                        .subscribeOn(Schedulers.io())
                        .onErrorReturn(throwable -> {
                            Log.d(TAG, "getCompanyInfo: onErrorReturn");
                            return new CompanyInfo();
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable -> mView.showRefresh())
                        .doFinally(mView::hideRefresh)
                        .subscribe(companyInfo -> {
                            mView.showCompanyInfo(companyInfo);
                        }, throwable -> {
                            Log.d(TAG, "getCompanyInfo: subscribe error");
                        })
        );
    }

}
