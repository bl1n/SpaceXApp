package com.lft.spacex.ui.launches;

import android.support.annotation.NonNull;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.model.launches.Launch;

import java.util.List;

interface LaunchesView extends BaseView {
    void showLaunches(@NonNull List<Launch> launches);
    void openLaunch(@NonNull long id);
}
