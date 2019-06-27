package com.lft.spacex.ui.companyInfo;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.model.CompanyInfo;

public interface CompanyInfoView extends BaseView {
    void showCompanyInfo(CompanyInfo companyInfo);
}
