
package com.lft.spacex.model.launches;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Core {

    @SerializedName("block")
    private Long mBlock;
    @SerializedName("core_serial")
    private String mCoreSerial;
    @SerializedName("flight")
    private Long mFlight;
    @SerializedName("gridfins")
    private Boolean mGridfins;
    @SerializedName("land_success")
    private Boolean mLandSuccess;
    @SerializedName("landing_intent")
    private Boolean mLandingIntent;
    @SerializedName("landing_type")
    private String mLandingType;
    @SerializedName("landing_vehicle")
    private String mLandingVehicle;
    @SerializedName("legs")
    private Boolean mLegs;
    @SerializedName("reused")
    private Boolean mReused;

    public Long getBlock() {
        return mBlock;
    }

    public String getCoreSerial() {
        return mCoreSerial;
    }

    public Long getFlight() {
        return mFlight;
    }

    public Boolean getGridfins() {
        return mGridfins;
    }

    public Boolean getLandSuccess() {
        return mLandSuccess;
    }

    public Boolean getLandingIntent() {
        return mLandingIntent;
    }

    public String getLandingType() {
        return mLandingType;
    }

    public String getLandingVehicle() {
        return mLandingVehicle;
    }

    public Boolean getLegs() {
        return mLegs;
    }

    public Boolean getReused() {
        return mReused;
    }

    public static class Builder {

        private Long mBlock;
        private String mCoreSerial;
        private Long mFlight;
        private Boolean mGridfins;
        private Boolean mLandSuccess;
        private Boolean mLandingIntent;
        private String mLandingType;
        private String mLandingVehicle;
        private Boolean mLegs;
        private Boolean mReused;

        public Core.Builder withBlock(Long block) {
            mBlock = block;
            return this;
        }

        public Core.Builder withCoreSerial(String coreSerial) {
            mCoreSerial = coreSerial;
            return this;
        }

        public Core.Builder withFlight(Long flight) {
            mFlight = flight;
            return this;
        }

        public Core.Builder withGridfins(Boolean gridfins) {
            mGridfins = gridfins;
            return this;
        }

        public Core.Builder withLandSuccess(Boolean landSuccess) {
            mLandSuccess = landSuccess;
            return this;
        }

        public Core.Builder withLandingIntent(Boolean landingIntent) {
            mLandingIntent = landingIntent;
            return this;
        }

        public Core.Builder withLandingType(String landingType) {
            mLandingType = landingType;
            return this;
        }

        public Core.Builder withLandingVehicle(String landingVehicle) {
            mLandingVehicle = landingVehicle;
            return this;
        }

        public Core.Builder withLegs(Boolean legs) {
            mLegs = legs;
            return this;
        }

        public Core.Builder withReused(Boolean reused) {
            mReused = reused;
            return this;
        }

        public Core build() {
            Core core = new Core();
            core.mBlock = mBlock;
            core.mCoreSerial = mCoreSerial;
            core.mFlight = mFlight;
            core.mGridfins = mGridfins;
            core.mLandSuccess = mLandSuccess;
            core.mLandingIntent = mLandingIntent;
            core.mLandingType = mLandingType;
            core.mLandingVehicle = mLandingVehicle;
            core.mLegs = mLegs;
            core.mReused = mReused;
            return core;
        }

    }

}
