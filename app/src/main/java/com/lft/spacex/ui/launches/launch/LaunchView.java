package com.lft.spacex.ui.launches.launch;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.model.launches.Launch;

interface LaunchView extends BaseView {
    void showLaunch(Launch launch);
}
