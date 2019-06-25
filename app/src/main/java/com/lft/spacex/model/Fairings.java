
package com.lft.spacex.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Fairings {

    @SerializedName("recovered")
    private Boolean mRecovered;
    @SerializedName("recovery_attempt")
    private Boolean mRecoveryAttempt;
    @SerializedName("reused")
    private Boolean mReused;
    @SerializedName("ship")
    private Object mShip;

    public Boolean getRecovered() {
        return mRecovered;
    }

    public Boolean getRecoveryAttempt() {
        return mRecoveryAttempt;
    }

    public Boolean getReused() {
        return mReused;
    }

    public Object getShip() {
        return mShip;
    }

    public static class Builder {

        private Boolean mRecovered;
        private Boolean mRecoveryAttempt;
        private Boolean mReused;
        private Object mShip;

        public Fairings.Builder withRecovered(Boolean recovered) {
            mRecovered = recovered;
            return this;
        }

        public Fairings.Builder withRecoveryAttempt(Boolean recoveryAttempt) {
            mRecoveryAttempt = recoveryAttempt;
            return this;
        }

        public Fairings.Builder withReused(Boolean reused) {
            mReused = reused;
            return this;
        }

        public Fairings.Builder withShip(Object ship) {
            mShip = ship;
            return this;
        }

        public Fairings build() {
            Fairings fairings = new Fairings();
            fairings.mRecovered = mRecovered;
            fairings.mRecoveryAttempt = mRecoveryAttempt;
            fairings.mReused = mReused;
            fairings.mShip = mShip;
            return fairings;
        }

    }

}
