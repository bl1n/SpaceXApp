package com.lft.spacex.ui.launches.launch;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lft.spacex.common.SingleFragmentActivity;
import com.lft.spacex.ui.history.event.EventFragment;

public class LaunchActivity extends SingleFragmentActivity {


    @Override
    protected Fragment getFragment() {
        if (getIntent() != null) {
            final Bundle bundle = getIntent().getBundleExtra(EventFragment.ARGS);
            return LaunchFragment.newInstance(bundle);
        }
        throw new IllegalStateException("getIntent cannot be null");
    }
}
