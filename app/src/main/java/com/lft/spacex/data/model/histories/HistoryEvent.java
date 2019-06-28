package com.lft.spacex.data.model.histories;

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


    public String getTitle() {
        return mTitle;
    }


    public String getEventDateUtc() {
        return mEventDateUtc;
    }


    public int getEventDateUnix() {
        return mEventDateUnix;
    }


    public int getFlightNumber() {
        return mFlightNumber;
    }


    public String getDetails() {
        return mDetails;
    }


    public LinksBean getLinks() {
        return mLinks;
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

    @Override
    public String toString() {
        return "HistoryEvent{" +
                "mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                ", mEventDateUtc='" + mEventDateUtc + '\'' +
                ", mEventDateUnix=" + mEventDateUnix +
                ", mFlightNumber=" + mFlightNumber +
                ", mDetails='" + mDetails + '\'' +
                ", mLinks=" + mLinks +
                '}';
    }
}
