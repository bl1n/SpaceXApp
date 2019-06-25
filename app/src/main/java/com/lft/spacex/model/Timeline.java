
package com.lft.spacex.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Timeline {

    @SerializedName("engine_chill")
    private Long mEngineChill;
    @SerializedName("fairing_deploy")
    private Long mFairingDeploy;
    @SerializedName("first_stage_entry_burn")
    private Long mFirstStageEntryBurn;
    @SerializedName("first_stage_landing")
    private Long mFirstStageLanding;
    @SerializedName("go_for_launch")
    private Long mGoForLaunch;
    @SerializedName("go_for_prop_loading")
    private Long mGoForPropLoading;
    @SerializedName("ignition")
    private Long mIgnition;
    @SerializedName("liftoff")
    private Long mLiftoff;
    @SerializedName("maxq")
    private Long mMaxq;
    @SerializedName("meco")
    private Long mMeco;
    @SerializedName("payload_deploy")
    private Long mPayloadDeploy;
    @SerializedName("prelaunch_checks")
    private Long mPrelaunchChecks;
    @SerializedName("propellant_pressurization")
    private Long mPropellantPressurization;
    @SerializedName("rp1_loading")
    private Long mRp1Loading;
    @SerializedName("seco-1")
    private Long mSeco1;
    @SerializedName("seco-2")
    private Long mSeco2;
    @SerializedName("second_stage_ignition")
    private Long mSecondStageIgnition;
    @SerializedName("second_stage_restart")
    private Long mSecondStageRestart;
    @SerializedName("stage1_lox_loading")
    private Long mStage1LoxLoading;
    @SerializedName("stage2_lox_loading")
    private Long mStage2LoxLoading;
    @SerializedName("stage_sep")
    private Long mStageSep;
    @SerializedName("webcast_liftoff")
    private Long mWebcastLiftoff;

    public Long getEngineChill() {
        return mEngineChill;
    }

    public Long getFairingDeploy() {
        return mFairingDeploy;
    }

    public Long getFirstStageEntryBurn() {
        return mFirstStageEntryBurn;
    }

    public Long getFirstStageLanding() {
        return mFirstStageLanding;
    }

    public Long getGoForLaunch() {
        return mGoForLaunch;
    }

    public Long getGoForPropLoading() {
        return mGoForPropLoading;
    }

    public Long getIgnition() {
        return mIgnition;
    }

    public Long getLiftoff() {
        return mLiftoff;
    }

    public Long getMaxq() {
        return mMaxq;
    }

    public Long getMeco() {
        return mMeco;
    }

    public Long getPayloadDeploy() {
        return mPayloadDeploy;
    }

    public Long getPrelaunchChecks() {
        return mPrelaunchChecks;
    }

    public Long getPropellantPressurization() {
        return mPropellantPressurization;
    }

    public Long getRp1Loading() {
        return mRp1Loading;
    }

    public Long getSeco1() {
        return mSeco1;
    }

    public Long getSeco2() {
        return mSeco2;
    }

    public Long getSecondStageIgnition() {
        return mSecondStageIgnition;
    }

    public Long getSecondStageRestart() {
        return mSecondStageRestart;
    }

    public Long getStage1LoxLoading() {
        return mStage1LoxLoading;
    }

    public Long getStage2LoxLoading() {
        return mStage2LoxLoading;
    }

    public Long getStageSep() {
        return mStageSep;
    }

    public Long getWebcastLiftoff() {
        return mWebcastLiftoff;
    }

    public static class Builder {

        private Long mEngineChill;
        private Long mFairingDeploy;
        private Long mFirstStageEntryBurn;
        private Long mFirstStageLanding;
        private Long mGoForLaunch;
        private Long mGoForPropLoading;
        private Long mIgnition;
        private Long mLiftoff;
        private Long mMaxq;
        private Long mMeco;
        private Long mPayloadDeploy;
        private Long mPrelaunchChecks;
        private Long mPropellantPressurization;
        private Long mRp1Loading;
        private Long mSeco1;
        private Long mSeco2;
        private Long mSecondStageIgnition;
        private Long mSecondStageRestart;
        private Long mStage1LoxLoading;
        private Long mStage2LoxLoading;
        private Long mStageSep;
        private Long mWebcastLiftoff;

        public Timeline.Builder withEngineChill(Long engineChill) {
            mEngineChill = engineChill;
            return this;
        }

        public Timeline.Builder withFairingDeploy(Long fairingDeploy) {
            mFairingDeploy = fairingDeploy;
            return this;
        }

        public Timeline.Builder withFirstStageEntryBurn(Long firstStageEntryBurn) {
            mFirstStageEntryBurn = firstStageEntryBurn;
            return this;
        }

        public Timeline.Builder withFirstStageLanding(Long firstStageLanding) {
            mFirstStageLanding = firstStageLanding;
            return this;
        }

        public Timeline.Builder withGoForLaunch(Long goForLaunch) {
            mGoForLaunch = goForLaunch;
            return this;
        }

        public Timeline.Builder withGoForPropLoading(Long goForPropLoading) {
            mGoForPropLoading = goForPropLoading;
            return this;
        }

        public Timeline.Builder withIgnition(Long ignition) {
            mIgnition = ignition;
            return this;
        }

        public Timeline.Builder withLiftoff(Long liftoff) {
            mLiftoff = liftoff;
            return this;
        }

        public Timeline.Builder withMaxq(Long maxq) {
            mMaxq = maxq;
            return this;
        }

        public Timeline.Builder withMeco(Long meco) {
            mMeco = meco;
            return this;
        }

        public Timeline.Builder withPayloadDeploy(Long payloadDeploy) {
            mPayloadDeploy = payloadDeploy;
            return this;
        }

        public Timeline.Builder withPrelaunchChecks(Long prelaunchChecks) {
            mPrelaunchChecks = prelaunchChecks;
            return this;
        }

        public Timeline.Builder withPropellantPressurization(Long propellantPressurization) {
            mPropellantPressurization = propellantPressurization;
            return this;
        }

        public Timeline.Builder withRp1Loading(Long rp1Loading) {
            mRp1Loading = rp1Loading;
            return this;
        }

        public Timeline.Builder withSeco1(Long seco1) {
            mSeco1 = seco1;
            return this;
        }

        public Timeline.Builder withSeco2(Long seco2) {
            mSeco2 = seco2;
            return this;
        }

        public Timeline.Builder withSecondStageIgnition(Long secondStageIgnition) {
            mSecondStageIgnition = secondStageIgnition;
            return this;
        }

        public Timeline.Builder withSecondStageRestart(Long secondStageRestart) {
            mSecondStageRestart = secondStageRestart;
            return this;
        }

        public Timeline.Builder withStage1LoxLoading(Long stage1LoxLoading) {
            mStage1LoxLoading = stage1LoxLoading;
            return this;
        }

        public Timeline.Builder withStage2LoxLoading(Long stage2LoxLoading) {
            mStage2LoxLoading = stage2LoxLoading;
            return this;
        }

        public Timeline.Builder withStageSep(Long stageSep) {
            mStageSep = stageSep;
            return this;
        }

        public Timeline.Builder withWebcastLiftoff(Long webcastLiftoff) {
            mWebcastLiftoff = webcastLiftoff;
            return this;
        }

        public Timeline build() {
            Timeline timeline = new Timeline();
            timeline.mEngineChill = mEngineChill;
            timeline.mFairingDeploy = mFairingDeploy;
            timeline.mFirstStageEntryBurn = mFirstStageEntryBurn;
            timeline.mFirstStageLanding = mFirstStageLanding;
            timeline.mGoForLaunch = mGoForLaunch;
            timeline.mGoForPropLoading = mGoForPropLoading;
            timeline.mIgnition = mIgnition;
            timeline.mLiftoff = mLiftoff;
            timeline.mMaxq = mMaxq;
            timeline.mMeco = mMeco;
            timeline.mPayloadDeploy = mPayloadDeploy;
            timeline.mPrelaunchChecks = mPrelaunchChecks;
            timeline.mPropellantPressurization = mPropellantPressurization;
            timeline.mRp1Loading = mRp1Loading;
            timeline.mSeco1 = mSeco1;
            timeline.mSeco2 = mSeco2;
            timeline.mSecondStageIgnition = mSecondStageIgnition;
            timeline.mSecondStageRestart = mSecondStageRestart;
            timeline.mStage1LoxLoading = mStage1LoxLoading;
            timeline.mStage2LoxLoading = mStage2LoxLoading;
            timeline.mStageSep = mStageSep;
            timeline.mWebcastLiftoff = mWebcastLiftoff;
            return timeline;
        }

    }

}
