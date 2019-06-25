
package com.lft.spacex.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FirstStage {

    @SerializedName("cores")
    private List<Core> mCores;

    public List<Core> getCores() {
        return mCores;
    }

    public static class Builder {

        private List<Core> mCores;

        public FirstStage.Builder withCores(List<Core> cores) {
            mCores = cores;
            return this;
        }

        public FirstStage build() {
            FirstStage firstStage = new FirstStage();
            firstStage.mCores = mCores;
            return firstStage;
        }

    }

}
