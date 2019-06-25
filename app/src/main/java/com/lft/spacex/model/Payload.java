
package com.lft.spacex.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Payload {

    @SerializedName("customers")
    private List<String> mCustomers;
    @SerializedName("manufacturer")
    private String mManufacturer;
    @SerializedName("nationality")
    private String mNationality;
    @SerializedName("norad_id")
    private List<Long> mNoradId;
    @SerializedName("orbit")
    private String mOrbit;
    @SerializedName("orbit_params")
    private OrbitParams mOrbitParams;
    @SerializedName("payload_id")
    private String mPayloadId;
    @SerializedName("payload_mass_kg")
    private Long mPayloadMassKg;
    @SerializedName("payload_mass_lbs")
    private Long mPayloadMassLbs;
    @SerializedName("payload_type")
    private String mPayloadType;
    @SerializedName("reused")
    private Boolean mReused;

    public List<String> getCustomers() {
        return mCustomers;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public String getNationality() {
        return mNationality;
    }

    public List<Long> getNoradId() {
        return mNoradId;
    }

    public String getOrbit() {
        return mOrbit;
    }

    public OrbitParams getOrbitParams() {
        return mOrbitParams;
    }

    public String getPayloadId() {
        return mPayloadId;
    }

    public Long getPayloadMassKg() {
        return mPayloadMassKg;
    }

    public Long getPayloadMassLbs() {
        return mPayloadMassLbs;
    }

    public String getPayloadType() {
        return mPayloadType;
    }

    public Boolean getReused() {
        return mReused;
    }

    public static class Builder {

        private List<String> mCustomers;
        private String mManufacturer;
        private String mNationality;
        private List<Long> mNoradId;
        private String mOrbit;
        private OrbitParams mOrbitParams;
        private String mPayloadId;
        private Long mPayloadMassKg;
        private Long mPayloadMassLbs;
        private String mPayloadType;
        private Boolean mReused;

        public Payload.Builder withCustomers(List<String> customers) {
            mCustomers = customers;
            return this;
        }

        public Payload.Builder withManufacturer(String manufacturer) {
            mManufacturer = manufacturer;
            return this;
        }

        public Payload.Builder withNationality(String nationality) {
            mNationality = nationality;
            return this;
        }

        public Payload.Builder withNoradId(List<Long> noradId) {
            mNoradId = noradId;
            return this;
        }

        public Payload.Builder withOrbit(String orbit) {
            mOrbit = orbit;
            return this;
        }

        public Payload.Builder withOrbitParams(OrbitParams orbitParams) {
            mOrbitParams = orbitParams;
            return this;
        }

        public Payload.Builder withPayloadId(String payloadId) {
            mPayloadId = payloadId;
            return this;
        }

        public Payload.Builder withPayloadMassKg(Long payloadMassKg) {
            mPayloadMassKg = payloadMassKg;
            return this;
        }

        public Payload.Builder withPayloadMassLbs(Long payloadMassLbs) {
            mPayloadMassLbs = payloadMassLbs;
            return this;
        }

        public Payload.Builder withPayloadType(String payloadType) {
            mPayloadType = payloadType;
            return this;
        }

        public Payload.Builder withReused(Boolean reused) {
            mReused = reused;
            return this;
        }

        public Payload build() {
            Payload payload = new Payload();
            payload.mCustomers = mCustomers;
            payload.mManufacturer = mManufacturer;
            payload.mNationality = mNationality;
            payload.mNoradId = mNoradId;
            payload.mOrbit = mOrbit;
            payload.mOrbitParams = mOrbitParams;
            payload.mPayloadId = mPayloadId;
            payload.mPayloadMassKg = mPayloadMassKg;
            payload.mPayloadMassLbs = mPayloadMassLbs;
            payload.mPayloadType = mPayloadType;
            payload.mReused = mReused;
            return payload;
        }

    }

}
