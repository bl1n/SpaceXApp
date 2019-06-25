
package com.lft.spacex.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Links {

    @SerializedName("article_link")
    private String mArticleLink;
    @SerializedName("flickr_images")
    private List<String> mFlickrImages;
    @SerializedName("mission_patch")
    private String mMissionPatch;
    @SerializedName("mission_patch_small")
    private String mMissionPatchSmall;
    @SerializedName("presskit")
    private String mPresskit;
    @SerializedName("reddit_campaign")
    private String mRedditCampaign;
    @SerializedName("reddit_launch")
    private String mRedditLaunch;
    @SerializedName("reddit_media")
    private String mRedditMedia;
    @SerializedName("reddit_recovery")
    private Object mRedditRecovery;
    @SerializedName("video_link")
    private String mVideoLink;
    @SerializedName("wikipedia")
    private String mWikipedia;
    @SerializedName("youtube_id")
    private String mYoutubeId;

    public String getArticleLink() {
        return mArticleLink;
    }

    public List<String> getFlickrImages() {
        return mFlickrImages;
    }

    public String getMissionPatch() {
        return mMissionPatch;
    }

    public String getMissionPatchSmall() {
        return mMissionPatchSmall;
    }

    public String getPresskit() {
        return mPresskit;
    }

    public String getRedditCampaign() {
        return mRedditCampaign;
    }

    public String getRedditLaunch() {
        return mRedditLaunch;
    }

    public String getRedditMedia() {
        return mRedditMedia;
    }

    public Object getRedditRecovery() {
        return mRedditRecovery;
    }

    public String getVideoLink() {
        return mVideoLink;
    }

    public String getWikipedia() {
        return mWikipedia;
    }

    public String getYoutubeId() {
        return mYoutubeId;
    }

    public static class Builder {

        private String mArticleLink;
        private List<String> mFlickrImages;
        private String mMissionPatch;
        private String mMissionPatchSmall;
        private String mPresskit;
        private String mRedditCampaign;
        private String mRedditLaunch;
        private String mRedditMedia;
        private Object mRedditRecovery;
        private String mVideoLink;
        private String mWikipedia;
        private String mYoutubeId;

        public Links.Builder withArticleLink(String articleLink) {
            mArticleLink = articleLink;
            return this;
        }

        public Links.Builder withFlickrImages(List<String> flickrImages) {
            mFlickrImages = flickrImages;
            return this;
        }

        public Links.Builder withMissionPatch(String missionPatch) {
            mMissionPatch = missionPatch;
            return this;
        }

        public Links.Builder withMissionPatchSmall(String missionPatchSmall) {
            mMissionPatchSmall = missionPatchSmall;
            return this;
        }

        public Links.Builder withPresskit(String presskit) {
            mPresskit = presskit;
            return this;
        }

        public Links.Builder withRedditCampaign(String redditCampaign) {
            mRedditCampaign = redditCampaign;
            return this;
        }

        public Links.Builder withRedditLaunch(String redditLaunch) {
            mRedditLaunch = redditLaunch;
            return this;
        }

        public Links.Builder withRedditMedia(String redditMedia) {
            mRedditMedia = redditMedia;
            return this;
        }

        public Links.Builder withRedditRecovery(Object redditRecovery) {
            mRedditRecovery = redditRecovery;
            return this;
        }

        public Links.Builder withVideoLink(String videoLink) {
            mVideoLink = videoLink;
            return this;
        }

        public Links.Builder withWikipedia(String wikipedia) {
            mWikipedia = wikipedia;
            return this;
        }

        public Links.Builder withYoutubeId(String youtubeId) {
            mYoutubeId = youtubeId;
            return this;
        }

        public Links build() {
            Links links = new Links();
            links.mArticleLink = mArticleLink;
            links.mFlickrImages = mFlickrImages;
            links.mMissionPatch = mMissionPatch;
            links.mMissionPatchSmall = mMissionPatchSmall;
            links.mPresskit = mPresskit;
            links.mRedditCampaign = mRedditCampaign;
            links.mRedditLaunch = mRedditLaunch;
            links.mRedditMedia = mRedditMedia;
            links.mRedditRecovery = mRedditRecovery;
            links.mVideoLink = mVideoLink;
            links.mWikipedia = mWikipedia;
            links.mYoutubeId = mYoutubeId;
            return links;
        }

    }

}
