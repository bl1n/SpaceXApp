
package com.lft.spacex.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class OrbitParams {

    @SerializedName("apoapsis_km")
    private Double mApoapsisKm;
    @SerializedName("arg_of_pericenter")
    private Double mArgOfPericenter;
    @SerializedName("eccentricity")
    private Double mEccentricity;
    @SerializedName("epoch")
    private String mEpoch;
    @SerializedName("inclination_deg")
    private Double mInclinationDeg;
    @SerializedName("lifespan_years")
    private Long mLifespanYears;
    @SerializedName("longitude")
    private Long mLongitude;
    @SerializedName("mean_anomaly")
    private Double mMeanAnomaly;
    @SerializedName("mean_motion")
    private Double mMeanMotion;
    @SerializedName("periapsis_km")
    private Double mPeriapsisKm;
    @SerializedName("period_min")
    private Double mPeriodMin;
    @SerializedName("raan")
    private Double mRaan;
    @SerializedName("reference_system")
    private String mReferenceSystem;
    @SerializedName("regime")
    private String mRegime;
    @SerializedName("semi_major_axis_km")
    private Double mSemiMajorAxisKm;

    public Double getApoapsisKm() {
        return mApoapsisKm;
    }

    public Double getArgOfPericenter() {
        return mArgOfPericenter;
    }

    public Double getEccentricity() {
        return mEccentricity;
    }

    public String getEpoch() {
        return mEpoch;
    }

    public Double getInclinationDeg() {
        return mInclinationDeg;
    }

    public Long getLifespanYears() {
        return mLifespanYears;
    }

    public Long getLongitude() {
        return mLongitude;
    }

    public Double getMeanAnomaly() {
        return mMeanAnomaly;
    }

    public Double getMeanMotion() {
        return mMeanMotion;
    }

    public Double getPeriapsisKm() {
        return mPeriapsisKm;
    }

    public Double getPeriodMin() {
        return mPeriodMin;
    }

    public Double getRaan() {
        return mRaan;
    }

    public String getReferenceSystem() {
        return mReferenceSystem;
    }

    public String getRegime() {
        return mRegime;
    }

    public Double getSemiMajorAxisKm() {
        return mSemiMajorAxisKm;
    }

    public static class Builder {

        private Double mApoapsisKm;
        private Double mArgOfPericenter;
        private Double mEccentricity;
        private String mEpoch;
        private Double mInclinationDeg;
        private Long mLifespanYears;
        private Long mLongitude;
        private Double mMeanAnomaly;
        private Double mMeanMotion;
        private Double mPeriapsisKm;
        private Double mPeriodMin;
        private Double mRaan;
        private String mReferenceSystem;
        private String mRegime;
        private Double mSemiMajorAxisKm;

        public OrbitParams.Builder withApoapsisKm(Double apoapsisKm) {
            mApoapsisKm = apoapsisKm;
            return this;
        }

        public OrbitParams.Builder withArgOfPericenter(Double argOfPericenter) {
            mArgOfPericenter = argOfPericenter;
            return this;
        }

        public OrbitParams.Builder withEccentricity(Double eccentricity) {
            mEccentricity = eccentricity;
            return this;
        }

        public OrbitParams.Builder withEpoch(String epoch) {
            mEpoch = epoch;
            return this;
        }

        public OrbitParams.Builder withInclinationDeg(Double inclinationDeg) {
            mInclinationDeg = inclinationDeg;
            return this;
        }

        public OrbitParams.Builder withLifespanYears(Long lifespanYears) {
            mLifespanYears = lifespanYears;
            return this;
        }

        public OrbitParams.Builder withLongitude(Long longitude) {
            mLongitude = longitude;
            return this;
        }

        public OrbitParams.Builder withMeanAnomaly(Double meanAnomaly) {
            mMeanAnomaly = meanAnomaly;
            return this;
        }

        public OrbitParams.Builder withMeanMotion(Double meanMotion) {
            mMeanMotion = meanMotion;
            return this;
        }

        public OrbitParams.Builder withPeriapsisKm(Double periapsisKm) {
            mPeriapsisKm = periapsisKm;
            return this;
        }

        public OrbitParams.Builder withPeriodMin(Double periodMin) {
            mPeriodMin = periodMin;
            return this;
        }

        public OrbitParams.Builder withRaan(Double raan) {
            mRaan = raan;
            return this;
        }

        public OrbitParams.Builder withReferenceSystem(String referenceSystem) {
            mReferenceSystem = referenceSystem;
            return this;
        }

        public OrbitParams.Builder withRegime(String regime) {
            mRegime = regime;
            return this;
        }

        public OrbitParams.Builder withSemiMajorAxisKm(Double semiMajorAxisKm) {
            mSemiMajorAxisKm = semiMajorAxisKm;
            return this;
        }

        public OrbitParams build() {
            OrbitParams orbitParams = new OrbitParams();
            orbitParams.mApoapsisKm = mApoapsisKm;
            orbitParams.mArgOfPericenter = mArgOfPericenter;
            orbitParams.mEccentricity = mEccentricity;
            orbitParams.mEpoch = mEpoch;
            orbitParams.mInclinationDeg = mInclinationDeg;
            orbitParams.mLifespanYears = mLifespanYears;
            orbitParams.mLongitude = mLongitude;
            orbitParams.mMeanAnomaly = mMeanAnomaly;
            orbitParams.mMeanMotion = mMeanMotion;
            orbitParams.mPeriapsisKm = mPeriapsisKm;
            orbitParams.mPeriodMin = mPeriodMin;
            orbitParams.mRaan = mRaan;
            orbitParams.mReferenceSystem = mReferenceSystem;
            orbitParams.mRegime = mRegime;
            orbitParams.mSemiMajorAxisKm = mSemiMajorAxisKm;
            return orbitParams;
        }

    }

}
