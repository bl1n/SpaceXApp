package com.lft.spacex.data.model.launches;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class LaunchesResponse implements Serializable {

    @SerializedName("launches")
    private List<Launch> mLaunches;

    public List<Launch> getLaunches() {
        return mLaunches;
    }

    public void setLaunches(List<Launch> launches) {
        mLaunches = launches;
    }
}
