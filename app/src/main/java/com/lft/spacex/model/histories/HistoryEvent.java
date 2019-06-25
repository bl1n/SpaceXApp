package com.lft.spacex.model.histories;

import com.google.gson.annotations.SerializedName;

public class HistoryEvent {

    /**
     * id : 1
     * title : Falcon 1 Makes History
     * event_date_utc : 2008-09-28T23:15:00Z
     * event_date_unix : 1222643700
     * flight_number : 4
     * details : Falcon 1 becomes the first privately developed liquid fuel rocket to reach Earth orbit.
     * links : {"reddit":null,"article":"http://www.spacex.com/news/2013/02/11/flight-4-launch-update-0","wikipedia":"https://en.wikipedia.org/wiki/Falcon_1"}
     */

    @SerializedName("id")
    private int mId;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("event_date_utc")
    private String mEventDateUtc;
    @SerializedName("event_date_unix")
    private int mEventDateUnix;
    @SerializedName("flight_number")
    private int mFlightNumber;
    @SerializedName("details")
    private String mDetails;
    @SerializedName("links")
    private LinksBean mLinks;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getEventDateUtc() {
        return mEventDateUtc;
    }

    public void setEventDateUtc(String eventDateUtc) {
        mEventDateUtc = eventDateUtc;
    }

    public int getEventDateUnix() {
        return mEventDateUnix;
    }

    public void setEventDateUnix(int eventDateUnix) {
        mEventDateUnix = eventDateUnix;
    }

    public int getFlightNumber() {
        return mFlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        mFlightNumber = flightNumber;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public LinksBean getLinks() {
        return mLinks;
    }

    public void setLinks(LinksBean links) {
        mLinks = links;
    }

    public static class LinksBean {
        /**
         * reddit : null
         * article : http://www.spacex.com/news/2013/02/11/flight-4-launch-update-0
         * wikipedia : https://en.wikipedia.org/wiki/Falcon_1
         */

        @SerializedName("reddit")
        private String mReddit;
        @SerializedName("article")
        private String mArticle;
        @SerializedName("wikipedia")
        private String mWikipedia;

        public String getReddit() {
            return mReddit;
        }

        public String getArticle() {
            return mArticle;
        }


        public String getWikipedia() {
            return mWikipedia;
        }

    }
}
