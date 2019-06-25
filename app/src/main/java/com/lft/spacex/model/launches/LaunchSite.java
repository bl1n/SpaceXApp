
package com.lft.spacex.model.launches;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LaunchSite {

    @SerializedName("site_id")
    private String mSiteId;
    @SerializedName("site_name")
    private String mSiteName;
    @SerializedName("site_name_long")
    private String mSiteNameLong;

    public String getSiteId() {
        return mSiteId;
    }

    public String getSiteName() {
        return mSiteName;
    }

    public String getSiteNameLong() {
        return mSiteNameLong;
    }

    public static class Builder {

        private String mSiteId;
        private String mSiteName;
        private String mSiteNameLong;

        public LaunchSite.Builder withSiteId(String siteId) {
            mSiteId = siteId;
            return this;
        }

        public LaunchSite.Builder withSiteName(String siteName) {
            mSiteName = siteName;
            return this;
        }

        public LaunchSite.Builder withSiteNameLong(String siteNameLong) {
            mSiteNameLong = siteNameLong;
            return this;
        }

        public LaunchSite build() {
            LaunchSite launchSite = new LaunchSite();
            launchSite.mSiteId = mSiteId;
            launchSite.mSiteName = mSiteName;
            launchSite.mSiteNameLong = mSiteNameLong;
            return launchSite;
        }

    }

}
