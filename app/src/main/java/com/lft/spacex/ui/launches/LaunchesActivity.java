package com.lft.spacex.ui.launches;

import android.support.v4.app.Fragment;

import com.lft.spacex.common.SingleFragmentActivity;

public class LaunchesActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getFragment() {
        return LaunchesFragment.newInstance();
    }
}
