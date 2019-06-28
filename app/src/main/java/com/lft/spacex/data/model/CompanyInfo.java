package com.lft.spacex.data.model;

import com.google.gson.annotations.SerializedName;

public class CompanyInfo {

    /**
     * name : SpaceX
     * founder : Elon Musk
     * founded : 2002
     * employees : 7000
     * vehicles : 3
     * launch_sites : 3
     * test_sites : 1
     * ceo : Elon Musk
     * cto : Elon Musk
     * coo : Gwynne Shotwell
     * cto_propulsion : Tom Mueller
     * valuation : 15000000000
     * headquarters : {"address":"Rocket Road","city":"Hawthorne","state":"California"}
     * summary : SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.
     */

    @SerializedName("name")
    private String mName;
    @SerializedName("founder")
    private String mFounder;
    @SerializedName("founded")
    private int mFounded;
    @SerializedName("employees")
    private int mEmployees;
    @SerializedName("vehicles")
    private int mVehicles;
    @SerializedName("launch_sites")
    private int mLaunchSites;
    @SerializedName("test_sites")
    private int mTestSites;
    @SerializedName("ceo")
    private String mCeo;
    @SerializedName("cto")
    private String mCto;
    @SerializedName("coo")
    private String mCoo;
    @SerializedName("cto_propulsion")
    private String mCtoPropulsion;
    @SerializedName("valuation")
    private long mValuation;
    @SerializedName("headquarters")
    private HeadquartersBean mHeadquarters;
    @SerializedName("summary")
    private String mSummary;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getFounder() {
        return mFounder;
    }

    public void setFounder(String founder) {
        mFounder = founder;
    }

    public int getFounded() {
        return mFounded;
    }

    public void setFounded(int founded) {
        mFounded = founded;
    }

    public int getEmployees() {
        return mEmployees;
    }

    public void setEmployees(int employees) {
        mEmployees = employees;
    }

    public int getVehicles() {
        return mVehicles;
    }

    public void setVehicles(int vehicles) {
        mVehicles = vehicles;
    }

    public int getLaunchSites() {
        return mLaunchSites;
    }

    public void setLaunchSites(int launchSites) {
        mLaunchSites = launchSites;
    }

    public int getTestSites() {
        return mTestSites;
    }

    public void setTestSites(int testSites) {
        mTestSites = testSites;
    }

    public String getCeo() {
        return mCeo;
    }

    public void setCeo(String ceo) {
        mCeo = ceo;
    }

    public String getCto() {
        return mCto;
    }

    public void setCto(String cto) {
        mCto = cto;
    }

    public String getCoo() {
        return mCoo;
    }

    public void setCoo(String coo) {
        mCoo = coo;
    }

    public String getCtoPropulsion() {
        return mCtoPropulsion;
    }

    public void setCtoPropulsion(String ctoPropulsion) {
        mCtoPropulsion = ctoPropulsion;
    }

    public long getValuation() {
        return mValuation;
    }

    public void setValuation(long valuation) {
        mValuation = valuation;
    }

    public HeadquartersBean getHeadquarters() {
        return mHeadquarters;
    }

    public void setHeadquarters(HeadquartersBean headquarters) {
        mHeadquarters = headquarters;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public static class HeadquartersBean {
        /**
         * address : Rocket Road
         * city : Hawthorne
         * state : California
         */

        @SerializedName("address")
        private String mAddress;
        @SerializedName("city")
        private String mCity;
        @SerializedName("state")
        private String mState;

        public String getAddress() {
            return mAddress;
        }

        public void setAddress(String address) {
            mAddress = address;
        }

        public String getCity() {
            return mCity;
        }

        public void setCity(String city) {
            mCity = city;
        }

        public String getState() {
            return mState;
        }

        public void setState(String state) {
            mState = state;
        }
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "mName='" + mName + '\'' +
                ", mFounder='" + mFounder + '\'' +
                ", mFounded=" + mFounded +
                ", mEmployees=" + mEmployees +
                ", mVehicles=" + mVehicles +
                ", mLaunchSites=" + mLaunchSites +
                ", mTestSites=" + mTestSites +
                ", mCeo='" + mCeo + '\'' +
                ", mCto='" + mCto + '\'' +
                ", mCoo='" + mCoo + '\'' +
                ", mCtoPropulsion='" + mCtoPropulsion + '\'' +
                ", mValuation=" + mValuation +
                ", mHeadquarters=" + mHeadquarters +
                ", mSummary='" + mSummary + '\'' +
                '}';
    }
}
