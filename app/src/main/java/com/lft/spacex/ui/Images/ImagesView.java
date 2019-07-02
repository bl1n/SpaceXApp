package com.lft.spacex.ui.Images;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.data.model.LaunchImage;

import java.util.List;

interface ImagesView extends BaseView {
    void showImages(List<LaunchImage> images);
}
