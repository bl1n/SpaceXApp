
package com.lft.spacex.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Telemetry {

    @SerializedName("flight_club")
    private String mFlightClub;

    public String getFlightClub() {
        return mFlightClub;
    }

    public static class Builder {

        private String mFlightClub;

        public Telemetry.Builder withFlightClub(String flightClub) {
            mFlightClub = flightClub;
            return this;
        }

        public Telemetry build() {
            Telemetry telemetry = new Telemetry();
            telemetry.mFlightClub = mFlightClub;
            return telemetry;
        }

    }

}
