package com.lft.spacex.ui.Images;

import android.support.v4.app.Fragment;

import com.lft.spacex.common.SingleFragmentActivity;

public class ImagesActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getFragment() {
        return ImagesFragment.newInstance();
    }
}
