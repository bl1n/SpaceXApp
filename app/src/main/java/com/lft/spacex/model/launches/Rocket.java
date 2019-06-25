
package com.lft.spacex.model.launches;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Rocket {

    @SerializedName("fairings")
    private Fairings mFairings;
    @SerializedName("first_stage")
    private FirstStage mFirstStage;
    @SerializedName("rocket_id")
    private String mRocketId;
    @SerializedName("rocket_name")
    private String mRocketName;
    @SerializedName("rocket_type")
    private String mRocketType;
    @SerializedName("second_stage")
    private SecondStage mSecondStage;

    public Fairings getFairings() {
        return mFairings;
    }

    public FirstStage getFirstStage() {
        return mFirstStage;
    }

    public String getRocketId() {
        return mRocketId;
    }

    public String getRocketName() {
        return mRocketName;
    }

    public String getRocketType() {
        return mRocketType;
    }

    public SecondStage getSecondStage() {
        return mSecondStage;
    }

    public static class Builder {

        private Fairings mFairings;
        private FirstStage mFirstStage;
        private String mRocketId;
        private String mRocketName;
        private String mRocketType;
        private SecondStage mSecondStage;

        public Rocket.Builder withFairings(Fairings fairings) {
            mFairings = fairings;
            return this;
        }

        public Rocket.Builder withFirstStage(FirstStage firstStage) {
            mFirstStage = firstStage;
            return this;
        }

        public Rocket.Builder withRocketId(String rocketId) {
            mRocketId = rocketId;
            return this;
        }

        public Rocket.Builder withRocketName(String rocketName) {
            mRocketName = rocketName;
            return this;
        }

        public Rocket.Builder withRocketType(String rocketType) {
            mRocketType = rocketType;
            return this;
        }

        public Rocket.Builder withSecondStage(SecondStage secondStage) {
            mSecondStage = secondStage;
            return this;
        }

        public Rocket build() {
            Rocket rocket = new Rocket();
            rocket.mFairings = mFairings;
            rocket.mFirstStage = mFirstStage;
            rocket.mRocketId = mRocketId;
            rocket.mRocketName = mRocketName;
            rocket.mRocketType = mRocketType;
            rocket.mSecondStage = mSecondStage;
            return rocket;
        }

    }

}
