package com.lft.spacex.common;

import android.support.v4.app.Fragment;

public abstract class PresenterFragment<P extends BasePresenter> extends Fragment {

    protected abstract P getPresenter();

    @Override
    public void onDetach() {
        if(getPresenter() == null)
            getPresenter().disposeAll();
        super.onDetach();
    }
}
