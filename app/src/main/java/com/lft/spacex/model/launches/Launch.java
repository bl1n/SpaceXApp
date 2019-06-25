
package com.lft.spacex.model.launches;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Launch {

    @SerializedName("details")
    private String mDetails;
    @SerializedName("flight_number")
    private Long mFlightNumber;
    @SerializedName("is_tentative")
    private Boolean mIsTentative;
    @SerializedName("launch_date_local")
    private String mLaunchDateLocal;
    @SerializedName("launch_date_unix")
    private Long mLaunchDateUnix;
    @SerializedName("launch_date_utc")
    private String mLaunchDateUtc;
    @SerializedName("launch_site")
    private LaunchSite mLaunchSite;
    @SerializedName("launch_success")
    private Boolean mLaunchSuccess;
    @SerializedName("launch_window")
    private Long mLaunchWindow;
    @SerializedName("launch_year")
    private String mLaunchYear;
    @SerializedName("links")
    private Links mLinks;
    @SerializedName("mission_id")
    private List<String> mMissionId;
    @SerializedName("mission_name")
    private String mMissionName;
    @SerializedName("rocket")
    private Rocket mRocket;
    @SerializedName("ships")
    private List<String> mShips;
    @SerializedName("static_fire_date_unix")
    private Long mStaticFireDateUnix;
    @SerializedName("static_fire_date_utc")
    private String mStaticFireDateUtc;
    @SerializedName("tbd")
    private Boolean mTbd;
    @SerializedName("telemetry")
    private Telemetry mTelemetry;
    @SerializedName("tentative_max_precision")
    private String mTentativeMaxPrecision;
    @SerializedName("timeline")
    private Timeline mTimeline;
    @SerializedName("upcoming")
    private Boolean mUpcoming;

    public String getDetails() {
        return mDetails;
    }

    public Long getFlightNumber() {
        return mFlightNumber;
    }

    public Boolean getIsTentative() {
        return mIsTentative;
    }

    public String getLaunchDateLocal() {
        return mLaunchDateLocal;
    }

    public Long getLaunchDateUnix() {
        return mLaunchDateUnix;
    }

    public String getLaunchDateUtc() {
        return mLaunchDateUtc;
    }

    public LaunchSite getLaunchSite() {
        return mLaunchSite;
    }

    public Boolean getLaunchSuccess() {
        return mLaunchSuccess;
    }

    public Long getLaunchWindow() {
        return mLaunchWindow;
    }

    public String getLaunchYear() {
        return mLaunchYear;
    }

    public Links getLinks() {
        return mLinks;
    }

    public List<String> getMissionId() {
        return mMissionId;
    }

    public String getMissionName() {
        return mMissionName;
    }

    public Rocket getRocket() {
        return mRocket;
    }

    public List<String> getShips() {
        return mShips;
    }

    public Long getStaticFireDateUnix() {
        return mStaticFireDateUnix;
    }

    public String getStaticFireDateUtc() {
        return mStaticFireDateUtc;
    }

    public Boolean getTbd() {
        return mTbd;
    }

    public Telemetry getTelemetry() {
        return mTelemetry;
    }

    public String getTentativeMaxPrecision() {
        return mTentativeMaxPrecision;
    }

    public Timeline getTimeline() {
        return mTimeline;
    }

    public Boolean getUpcoming() {
        return mUpcoming;
    }

    public static class Builder {

        private String mDetails;
        private Long mFlightNumber;
        private Boolean mIsTentative;
        private String mLaunchDateLocal;
        private Long mLaunchDateUnix;
        private String mLaunchDateUtc;
        private LaunchSite mLaunchSite;
        private Boolean mLaunchSuccess;
        private Long mLaunchWindow;
        private String mLaunchYear;
        private Links mLinks;
        private List<String> mMissionId;
        private String mMissionName;
        private Rocket mRocket;
        private List<String> mShips;
        private Long mStaticFireDateUnix;
        private String mStaticFireDateUtc;
        private Boolean mTbd;
        private Telemetry mTelemetry;
        private String mTentativeMaxPrecision;
        private Timeline mTimeline;
        private Boolean mUpcoming;

        public Launch.Builder withDetails(String details) {
            mDetails = details;
            return this;
        }

        public Launch.Builder withFlightNumber(Long flightNumber) {
            mFlightNumber = flightNumber;
            return this;
        }

        public Launch.Builder withIsTentative(Boolean isTentative) {
            mIsTentative = isTentative;
            return this;
        }

        public Launch.Builder withLaunchDateLocal(String launchDateLocal) {
            mLaunchDateLocal = launchDateLocal;
            return this;
        }

        public Launch.Builder withLaunchDateUnix(Long launchDateUnix) {
            mLaunchDateUnix = launchDateUnix;
            return this;
        }

        public Launch.Builder withLaunchDateUtc(String launchDateUtc) {
            mLaunchDateUtc = launchDateUtc;
            return this;
        }

        public Launch.Builder withLaunchSite(LaunchSite launchSite) {
            mLaunchSite = launchSite;
            return this;
        }

        public Launch.Builder withLaunchSuccess(Boolean launchSuccess) {
            mLaunchSuccess = launchSuccess;
            return this;
        }

        public Launch.Builder withLaunchWindow(Long launchWindow) {
            mLaunchWindow = launchWindow;
            return this;
        }

        public Launch.Builder withLaunchYear(String launchYear) {
            mLaunchYear = launchYear;
            return this;
        }

        public Launch.Builder withLinks(Links links) {
            mLinks = links;
            return this;
        }

        public Launch.Builder withMissionId(List<String> missionId) {
            mMissionId = missionId;
            return this;
        }

        public Launch.Builder withMissionName(String missionName) {
            mMissionName = missionName;
            return this;
        }

        public Launch.Builder withRocket(Rocket rocket) {
            mRocket = rocket;
            return this;
        }

        public Launch.Builder withShips(List<String> ships) {
            mShips = ships;
            return this;
        }

        public Launch.Builder withStaticFireDateUnix(Long staticFireDateUnix) {
            mStaticFireDateUnix = staticFireDateUnix;
            return this;
        }

        public Launch.Builder withStaticFireDateUtc(String staticFireDateUtc) {
            mStaticFireDateUtc = staticFireDateUtc;
            return this;
        }

        public Launch.Builder withTbd(Boolean tbd) {
            mTbd = tbd;
            return this;
        }

        public Launch.Builder withTelemetry(Telemetry telemetry) {
            mTelemetry = telemetry;
            return this;
        }

        public Launch.Builder withTentativeMaxPrecision(String tentativeMaxPrecision) {
            mTentativeMaxPrecision = tentativeMaxPrecision;
            return this;
        }

        public Launch.Builder withTimeline(Timeline timeline) {
            mTimeline = timeline;
            return this;
        }

        public Launch.Builder withUpcoming(Boolean upcoming) {
            mUpcoming = upcoming;
            return this;
        }

        public Launch build() {
            Launch launch = new Launch();
            launch.mDetails = mDetails;
            launch.mFlightNumber = mFlightNumber;
            launch.mIsTentative = mIsTentative;
            launch.mLaunchDateLocal = mLaunchDateLocal;
            launch.mLaunchDateUnix = mLaunchDateUnix;
            launch.mLaunchDateUtc = mLaunchDateUtc;
            launch.mLaunchSite = mLaunchSite;
            launch.mLaunchSuccess = mLaunchSuccess;
            launch.mLaunchWindow = mLaunchWindow;
            launch.mLaunchYear = mLaunchYear;
            launch.mLinks = mLinks;
            launch.mMissionId = mMissionId;
            launch.mMissionName = mMissionName;
            launch.mRocket = mRocket;
            launch.mShips = mShips;
            launch.mStaticFireDateUnix = mStaticFireDateUnix;
            launch.mStaticFireDateUtc = mStaticFireDateUtc;
            launch.mTbd = mTbd;
            launch.mTelemetry = mTelemetry;
            launch.mTentativeMaxPrecision = mTentativeMaxPrecision;
            launch.mTimeline = mTimeline;
            launch.mUpcoming = mUpcoming;
            return launch;
        }

    }

}
