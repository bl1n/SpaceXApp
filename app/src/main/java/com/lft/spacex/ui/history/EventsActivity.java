package com.lft.spacex.ui.history;

import android.support.v4.app.Fragment;

import com.lft.spacex.common.SingleFragmentActivity;

public class EventsActivity extends SingleFragmentActivity {


    @Override
    protected Fragment getFragment() {
        return EventsFragment.newInstance();
    }
}
