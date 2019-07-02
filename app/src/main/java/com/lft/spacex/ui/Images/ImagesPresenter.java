package com.lft.spacex.ui.Images;

import com.lft.spacex.common.BasePresenter;
import com.lft.spacex.data.Storage;
import com.lft.spacex.data.model.LaunchImage;

import java.util.List;

import javax.inject.Inject;

public class ImagesPresenter extends BasePresenter {
    private static final String TAG = "Debug";

    private ImagesView mView;

    @Inject
    Storage mStorage;
    @Inject

    public ImagesPresenter() {
    }

    public void setView(ImagesView view) {
        mView = view;
    }

    public void getImages() {


        List<LaunchImage> images = mStorage.getLaunchImages();
        mView.showImages(images);
    }
}
