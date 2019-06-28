package com.lft.spacex.ui.companyInfo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.R;
import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.RefreshOwner;
import com.lft.spacex.common.Refreshable;
import com.lft.spacex.data.model.CompanyInfo;

import javax.inject.Inject;

public class CompanyInfoFragment extends PresenterFragment<CompanyInfoPresenter>
        implements Refreshable, CompanyInfoView {

    private RefreshOwner mRefreshOwner;
    private View mErrorView;
    private LinearLayout mLinearLayout;
    private TextView mCITittle;

    @Inject
    CompanyInfoPresenter mPresenter;

    public static CompanyInfoFragment newInstance() {
        return new CompanyInfoFragment();
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
        return inflater.inflate(R.layout.fr_company_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mErrorView = view.findViewById(R.id.errorView);
        mLinearLayout = view.findViewById(R.id.ci_group);
        mCITittle = view.findViewById(R.id.ci_tittle);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setTitle("Launches");
        }
        AppDelegate.getAppComponent().inject(this);
        mPresenter.setView(this);
        onRefreshData();
    }
    @Override
    public void onRefreshData() {
        mPresenter.getCompanyInfo();
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
    protected CompanyInfoPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void showCompanyInfo(CompanyInfo companyInfo) {
        mCITittle.setText(companyInfo.getCeo());
    }
}
