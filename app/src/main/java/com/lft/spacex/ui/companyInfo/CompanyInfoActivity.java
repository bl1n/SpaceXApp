package com.lft.spacex.ui.companyInfo;

import android.support.v4.app.Fragment;

import com.lft.spacex.common.SingleFragmentActivity;

public class CompanyInfoActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getFragment() {
        return CompanyInfoFragment.newInstance();
    }
}
