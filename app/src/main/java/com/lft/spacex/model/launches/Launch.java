
package com.lft.spacex.model.launches;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Launch {

    /**
     * flight_number : 65
     * mission_name : Telstar 19V
     * mission_id : ["F4F83DE"]
     * launch_year : 2018
     * launch_date_unix : 1532238600
     * launch_date_utc : 2018-07-22T05:50:00.000Z
     * launch_date_local : 2018-07-22T01:50:00-04:00
     * is_tentative : false
     * tentative_max_precision : hour
     * tbd : false
     * launch_window : 7200
     * rocket : {"rocket_id":"falcon9","rocket_name":"Falcon 9","rocket_type":"FT","first_stage":{"cores":[{"core_serial":"B1047","flight":1,"block":5,"gridfins":true,"legs":true,"reused":false,"land_success":true,"landing_intent":true,"landing_type":"ASDS","landing_vehicle":"OCISLY"}]},"second_stage":{"block":5,"payloads":[{"payload_id":"Telstar 19V","norad_id":[43562],"reused":false,"customers":["Telesat"],"nationality":"Canada","manufacturer":"SSL","payload_type":"Satellite","payload_mass_kg":7076,"payload_mass_lbs":15600,"orbit":"GTO","orbit_params":{"reference_system":"geocentric","regime":"geostationary","longitude":-65,"semi_major_axis_km":42163.837,"eccentricity":1.327E-4,"periapsis_km":35780.107,"apoapsis_km":35791.297,"inclination_deg":0.0126,"period_min":1436.051,"lifespan_years":15,"epoch":"2019-02-03T19:17:09.000Z","mean_motion":1.00274977,"raan":130.2989,"arg_of_pericenter":165.1069,"mean_anomaly":64.5495}}]},"fairings":{"reused":false,"recovery_attempt":false,"recovered":false,"ship":null}}
     * ships : ["GOPURSUIT","GOQUEST","HAWK","OCISLY"]
     * telemetry : {"flight_club":"https://www.flightclub.io/results/?code=TS19V"}
     * launch_site : {"site_id":"ccafs_slc_40","site_name":"CCAFS SLC 40","site_name_long":"Cape Canaveral Air Force Station Space Launch Complex 40"}
     * launch_success : true
     * links : {"mission_patch":"https://images2.imgbox.com/c5/53/5jklZkPz_o.png","mission_patch_small":"https://images2.imgbox.com/12/7c/NiniYxoh_o.png","reddit_campaign":"https://www.reddit.com/r/spacex/comments/8w19yg/telstar_19v_launch_campaign_thread/","reddit_launch":"https://www.reddit.com/r/spacex/comments/90p1a6/rspacex_telstar_19v_official_launch_discussion/","reddit_recovery":null,"reddit_media":"https://www.reddit.com/r/spacex/comments/90oxrr/rspacex_telstar_19v_media_thread_videos_images/","presskit":"http://www.spacex.com/sites/spacex/files/telstar19vantagepresskit.pdf","article_link":"https://spaceflightnow.com/2018/07/22/spacex-delivers-for-telesat-with-successful-early-morning-launch/","wikipedia":"https://en.wikipedia.org/wiki/Telstar_19V","video_link":"https://www.youtube.com/watch?v=xybp6zLaGx4","youtube_id":"xybp6zLaGx4","flickr_images":["https://farm1.staticflickr.com/856/28684550147_49802752b3_o.jpg","https://farm1.staticflickr.com/927/28684552447_956a9744f1_o.jpg","https://farm2.staticflickr.com/1828/29700007298_8ac5891d2c_o.jpg","https://farm1.staticflickr.com/914/29700004918_31ed7b73ef_o.jpg","https://farm1.staticflickr.com/844/29700002748_3047e50a0a_o.jpg","https://farm2.staticflickr.com/1786/29700000688_2514cd3cbb_o.jpg"]}
     * details : SSL-manufactured communications satellite intended to be placed at 63° West over the Americas. At 7,075 kg, it became the heaviest commercial communications satellite ever launched.
     * upcoming : false
     * static_fire_date_utc : 2018-07-18T21:00:00.000Z
     * static_fire_date_unix : 1531947600
     * timeline : {"webcast_liftoff":899,"go_for_prop_loading":-2280,"rp1_loading":-2100,"stage1_lox_loading":-2100,"stage2_lox_loading":-960,"engine_chill":-420,"prelaunch_checks":-60,"propellant_pressurization":-60,"go_for_launch":-45,"ignition":-3,"liftoff":0,"maxq":72,"meco":150,"stage_sep":153,"second_stage_ignition":154,"fairing_deploy":220,"first_stage_entry_burn":372,"seco-1":492,"first_stage_landing":509,"second_stage_restart":1609,"seco-2":1659,"payload_deploy":1960}
     */

    @SerializedName("flight_number")
    private int mFlightNumber;
    @SerializedName("mission_name")
    private String mMissionName;
    @SerializedName("launch_year")
    private String mLaunchYear;
    @SerializedName("launch_date_unix")
    private int mLaunchDateUnix;
    @SerializedName("launch_date_utc")
    private String mLaunchDateUtc;
    @SerializedName("launch_date_local")
    private String mLaunchDateLocal;
    @SerializedName("is_tentative")
    private boolean mIsTentative;
    @SerializedName("tentative_max_precision")
    private String mTentativeMaxPrecision;
    @SerializedName("tbd")
    private boolean mTbd;
    @SerializedName("launch_window")
    private int mLaunchWindow;
    @SerializedName("rocket")
    private RocketBean mRocket;
    @SerializedName("telemetry")
    private TelemetryBean mTelemetry;
    @SerializedName("launch_site")
    private LaunchSiteBean mLaunchSite;
    @SerializedName("launch_success")
    private boolean mLaunchSuccess;
    @SerializedName("links")
    private LinksBean mLinks;
    @SerializedName("details")
    private String mDetails;
    @SerializedName("upcoming")
    private boolean mUpcoming;
    @SerializedName("static_fire_date_utc")
    private String mStaticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    private int mStaticFireDateUnix;
    @SerializedName("timeline")
    private TimelineBean mTimeline;
    @SerializedName("mission_id")
    private List<String> mMissionId;
    @SerializedName("ships")
    private List<String> mShips;

    public int getFlightNumber() {
        return mFlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        mFlightNumber = flightNumber;
    }

    public String getMissionName() {
        return mMissionName;
    }

    public void setMissionName(String missionName) {
        mMissionName = missionName;
    }

    public String getLaunchYear() {
        return mLaunchYear;
    }

    public void setLaunchYear(String launchYear) {
        mLaunchYear = launchYear;
    }

    public int getLaunchDateUnix() {
        return mLaunchDateUnix;
    }

    public void setLaunchDateUnix(int launchDateUnix) {
        mLaunchDateUnix = launchDateUnix;
    }

    public String getLaunchDateUtc() {
        return mLaunchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        mLaunchDateUtc = launchDateUtc;
    }

    public String getLaunchDateLocal() {
        return mLaunchDateLocal;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        mLaunchDateLocal = launchDateLocal;
    }

    public boolean isIsTentative() {
        return mIsTentative;
    }

    public void setIsTentative(boolean isTentative) {
        mIsTentative = isTentative;
    }

    public String getTentativeMaxPrecision() {
        return mTentativeMaxPrecision;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        mTentativeMaxPrecision = tentativeMaxPrecision;
    }

    public boolean isTbd() {
        return mTbd;
    }

    public void setTbd(boolean tbd) {
        mTbd = tbd;
    }

    public int getLaunchWindow() {
        return mLaunchWindow;
    }

    public void setLaunchWindow(int launchWindow) {
        mLaunchWindow = launchWindow;
    }

    public RocketBean getRocket() {
        return mRocket;
    }

    public void setRocket(RocketBean rocket) {
        mRocket = rocket;
    }

    public TelemetryBean getTelemetry() {
        return mTelemetry;
    }

    public void setTelemetry(TelemetryBean telemetry) {
        mTelemetry = telemetry;
    }

    public LaunchSiteBean getLaunchSite() {
        return mLaunchSite;
    }

    public void setLaunchSite(LaunchSiteBean launchSite) {
        mLaunchSite = launchSite;
    }

    public boolean isLaunchSuccess() {
        return mLaunchSuccess;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        mLaunchSuccess = launchSuccess;
    }

    public LinksBean getLinks() {
        return mLinks;
    }

    public void setLinks(LinksBean links) {
        mLinks = links;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public boolean isUpcoming() {
        return mUpcoming;
    }

    public void setUpcoming(boolean upcoming) {
        mUpcoming = upcoming;
    }

    public String getStaticFireDateUtc() {
        return mStaticFireDateUtc;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        mStaticFireDateUtc = staticFireDateUtc;
    }

    public int getStaticFireDateUnix() {
        return mStaticFireDateUnix;
    }

    public void setStaticFireDateUnix(int staticFireDateUnix) {
        mStaticFireDateUnix = staticFireDateUnix;
    }

    public TimelineBean getTimeline() {
        return mTimeline;
    }

    public void setTimeline(TimelineBean timeline) {
        mTimeline = timeline;
    }

    public List<String> getMissionId() {
        return mMissionId;
    }

    public void setMissionId(List<String> missionId) {
        mMissionId = missionId;
    }

    public List<String> getShips() {
        return mShips;
    }

    public void setShips(List<String> ships) {
        mShips = ships;
    }

    public static class RocketBean {
        /**
         * rocket_id : falcon9
         * rocket_name : Falcon 9
         * rocket_type : FT
         * first_stage : {"cores":[{"core_serial":"B1047","flight":1,"block":5,"gridfins":true,"legs":true,"reused":false,"land_success":true,"landing_intent":true,"landing_type":"ASDS","landing_vehicle":"OCISLY"}]}
         * second_stage : {"block":5,"payloads":[{"payload_id":"Telstar 19V","norad_id":[43562],"reused":false,"customers":["Telesat"],"nationality":"Canada","manufacturer":"SSL","payload_type":"Satellite","payload_mass_kg":7076,"payload_mass_lbs":15600,"orbit":"GTO","orbit_params":{"reference_system":"geocentric","regime":"geostationary","longitude":-65,"semi_major_axis_km":42163.837,"eccentricity":1.327E-4,"periapsis_km":35780.107,"apoapsis_km":35791.297,"inclination_deg":0.0126,"period_min":1436.051,"lifespan_years":15,"epoch":"2019-02-03T19:17:09.000Z","mean_motion":1.00274977,"raan":130.2989,"arg_of_pericenter":165.1069,"mean_anomaly":64.5495}}]}
         * fairings : {"reused":false,"recovery_attempt":false,"recovered":false,"ship":null}
         */

        @SerializedName("rocket_id")
        private String mRocketId;
        @SerializedName("rocket_name")
        private String mRocketName;
        @SerializedName("rocket_type")
        private String mRocketType;
        @SerializedName("first_stage")
        private FirstStageBean mFirstStage;
        @SerializedName("second_stage")
        private SecondStageBean mSecondStage;
        @SerializedName("fairings")
        private FairingsBean mFairings;

        public String getRocketId() {
            return mRocketId;
        }

        public void setRocketId(String rocketId) {
            mRocketId = rocketId;
        }

        public String getRocketName() {
            return mRocketName;
        }

        public void setRocketName(String rocketName) {
            mRocketName = rocketName;
        }

        public String getRocketType() {
            return mRocketType;
        }

        public void setRocketType(String rocketType) {
            mRocketType = rocketType;
        }

        public FirstStageBean getFirstStage() {
            return mFirstStage;
        }

        public void setFirstStage(FirstStageBean firstStage) {
            mFirstStage = firstStage;
        }

        public SecondStageBean getSecondStage() {
            return mSecondStage;
        }

        public void setSecondStage(SecondStageBean secondStage) {
            mSecondStage = secondStage;
        }

        public FairingsBean getFairings() {
            return mFairings;
        }

        public void setFairings(FairingsBean fairings) {
            mFairings = fairings;
        }

        public static class FirstStageBean {
            @SerializedName("cores")
            private List<CoresBean> mCores;

            public List<CoresBean> getCores() {
                return mCores;
            }

            public void setCores(List<CoresBean> cores) {
                mCores = cores;
            }

            public static class CoresBean {
                /**
                 * core_serial : B1047
                 * flight : 1
                 * block : 5
                 * gridfins : true
                 * legs : true
                 * reused : false
                 * land_success : true
                 * landing_intent : true
                 * landing_type : ASDS
                 * landing_vehicle : OCISLY
                 */

                @SerializedName("core_serial")
                private String mCoreSerial;
                @SerializedName("flight")
                private int mFlight;
                @SerializedName("block")
                private int mBlock;
                @SerializedName("gridfins")
                private boolean mGridfins;
                @SerializedName("legs")
                private boolean mLegs;
                @SerializedName("reused")
                private boolean mReused;
                @SerializedName("land_success")
                private boolean mLandSuccess;
                @SerializedName("landing_intent")
                private boolean mLandingIntent;
                @SerializedName("landing_type")
                private String mLandingType;
                @SerializedName("landing_vehicle")
                private String mLandingVehicle;

                public String getCoreSerial() {
                    return mCoreSerial;
                }

                public void setCoreSerial(String coreSerial) {
                    mCoreSerial = coreSerial;
                }

                public int getFlight() {
                    return mFlight;
                }

                public void setFlight(int flight) {
                    mFlight = flight;
                }

                public int getBlock() {
                    return mBlock;
                }

                public void setBlock(int block) {
                    mBlock = block;
                }

                public boolean isGridfins() {
                    return mGridfins;
                }

                public void setGridfins(boolean gridfins) {
                    mGridfins = gridfins;
                }

                public boolean isLegs() {
                    return mLegs;
                }

                public void setLegs(boolean legs) {
                    mLegs = legs;
                }

                public boolean isReused() {
                    return mReused;
                }

                public void setReused(boolean reused) {
                    mReused = reused;
                }

                public boolean isLandSuccess() {
                    return mLandSuccess;
                }

                public void setLandSuccess(boolean landSuccess) {
                    mLandSuccess = landSuccess;
                }

                public boolean isLandingIntent() {
                    return mLandingIntent;
                }

                public void setLandingIntent(boolean landingIntent) {
                    mLandingIntent = landingIntent;
                }

                public String getLandingType() {
                    return mLandingType;
                }

                public void setLandingType(String landingType) {
                    mLandingType = landingType;
                }

                public String getLandingVehicle() {
                    return mLandingVehicle;
                }

                public void setLandingVehicle(String landingVehicle) {
                    mLandingVehicle = landingVehicle;
                }
            }
        }

        public static class SecondStageBean {
            /**
             * block : 5
             * payloads : [{"payload_id":"Telstar 19V","norad_id":[43562],"reused":false,"customers":["Telesat"],"nationality":"Canada","manufacturer":"SSL","payload_type":"Satellite","payload_mass_kg":7076,"payload_mass_lbs":15600,"orbit":"GTO","orbit_params":{"reference_system":"geocentric","regime":"geostationary","longitude":-65,"semi_major_axis_km":42163.837,"eccentricity":1.327E-4,"periapsis_km":35780.107,"apoapsis_km":35791.297,"inclination_deg":0.0126,"period_min":1436.051,"lifespan_years":15,"epoch":"2019-02-03T19:17:09.000Z","mean_motion":1.00274977,"raan":130.2989,"arg_of_pericenter":165.1069,"mean_anomaly":64.5495}}]
             */

            @SerializedName("block")
            private int mBlock;
            @SerializedName("payloads")
            private List<PayloadsBean> mPayloads;

            public int getBlock() {
                return mBlock;
            }

            public void setBlock(int block) {
                mBlock = block;
            }

            public List<PayloadsBean> getPayloads() {
                return mPayloads;
            }

            public void setPayloads(List<PayloadsBean> payloads) {
                mPayloads = payloads;
            }

            public static class PayloadsBean {
                /**
                 * payload_id : Telstar 19V
                 * norad_id : [43562]
                 * reused : false
                 * customers : ["Telesat"]
                 * nationality : Canada
                 * manufacturer : SSL
                 * payload_type : Satellite
                 * payload_mass_kg : 7076
                 * payload_mass_lbs : 15600
                 * orbit : GTO
                 * orbit_params : {"reference_system":"geocentric","regime":"geostationary","longitude":-65,"semi_major_axis_km":42163.837,"eccentricity":1.327E-4,"periapsis_km":35780.107,"apoapsis_km":35791.297,"inclination_deg":0.0126,"period_min":1436.051,"lifespan_years":15,"epoch":"2019-02-03T19:17:09.000Z","mean_motion":1.00274977,"raan":130.2989,"arg_of_pericenter":165.1069,"mean_anomaly":64.5495}
                 */

                @SerializedName("payload_id")
                private String mPayloadId;
                @SerializedName("reused")
                private boolean mReused;
                @SerializedName("nationality")
                private String mNationality;
                @SerializedName("manufacturer")
                private String mManufacturer;
                @SerializedName("payload_type")
                private String mPayloadType;
                @SerializedName("payload_mass_kg")
                private double mPayloadMassKg;
                @SerializedName("payload_mass_lbs")
                private double mPayloadMassLbs;
                @SerializedName("orbit")
                private String mOrbit;
                @SerializedName("orbit_params")
                private OrbitParamsBean mOrbitParams;
                @SerializedName("norad_id")
                private List<Integer> mNoradId;
                @SerializedName("customers")
                private List<String> mCustomers;

                public String getPayloadId() {
                    return mPayloadId;
                }

                public void setPayloadId(String payloadId) {
                    mPayloadId = payloadId;
                }

                public boolean isReused() {
                    return mReused;
                }

                public void setReused(boolean reused) {
                    mReused = reused;
                }

                public String getNationality() {
                    return mNationality;
                }

                public void setNationality(String nationality) {
                    mNationality = nationality;
                }

                public String getManufacturer() {
                    return mManufacturer;
                }

                public void setManufacturer(String manufacturer) {
                    mManufacturer = manufacturer;
                }

                public String getPayloadType() {
                    return mPayloadType;
                }

                public void setPayloadType(String payloadType) {
                    mPayloadType = payloadType;
                }

                public double getPayloadMassKg() {
                    return mPayloadMassKg;
                }

                public void setPayloadMassKg(double payloadMassKg) {
                    mPayloadMassKg = payloadMassKg;
                }

                public double getPayloadMassLbs() {
                    return mPayloadMassLbs;
                }

                public void setPayloadMassLbs(double payloadMassLbs) {
                    mPayloadMassLbs = payloadMassLbs;
                }

                public String getOrbit() {
                    return mOrbit;
                }

                public void setOrbit(String orbit) {
                    mOrbit = orbit;
                }

                public OrbitParamsBean getOrbitParams() {
                    return mOrbitParams;
                }

                public void setOrbitParams(OrbitParamsBean orbitParams) {
                    mOrbitParams = orbitParams;
                }

                public List<Integer> getNoradId() {
                    return mNoradId;
                }

                public void setNoradId(List<Integer> noradId) {
                    mNoradId = noradId;
                }

                public List<String> getCustomers() {
                    return mCustomers;
                }

                public void setCustomers(List<String> customers) {
                    mCustomers = customers;
                }

                public static class OrbitParamsBean {
                    /**
                     * reference_system : geocentric
                     * regime : geostationary
                     * longitude : -65
                     * semi_major_axis_km : 42163.837
                     * eccentricity : 1.327E-4
                     * periapsis_km : 35780.107
                     * apoapsis_km : 35791.297
                     * inclination_deg : 0.0126
                     * period_min : 1436.051
                     * lifespan_years : 15
                     * epoch : 2019-02-03T19:17:09.000Z
                     * mean_motion : 1.00274977
                     * raan : 130.2989
                     * arg_of_pericenter : 165.1069
                     * mean_anomaly : 64.5495
                     */

                    @SerializedName("reference_system")
                    private String mReferenceSystem;
                    @SerializedName("regime")
                    private String mRegime;
                    @SerializedName("longitude")
                    private double mLongitude;
                    @SerializedName("semi_major_axis_km")
                    private double mSemiMajorAxisKm;
                    @SerializedName("eccentricity")
                    private double mEccentricity;
                    @SerializedName("periapsis_km")
                    private double mPeriapsisKm;
                    @SerializedName("apoapsis_km")
                    private double mApoapsisKm;
                    @SerializedName("inclination_deg")
                    private double mInclinationDeg;
                    @SerializedName("period_min")
                    private double mPeriodMin;
                    @SerializedName("lifespan_years")
                    private double mLifespanYears;
                    @SerializedName("epoch")
                    private String mEpoch;
                    @SerializedName("mean_motion")
                    private double mMeanMotion;
                    @SerializedName("raan")
                    private double mRaan;
                    @SerializedName("arg_of_pericenter")
                    private double mArgOfPericenter;
                    @SerializedName("mean_anomaly")
                    private double mMeanAnomaly;

                    public String getReferenceSystem() {
                        return mReferenceSystem;
                    }

                    public void setReferenceSystem(String referenceSystem) {
                        mReferenceSystem = referenceSystem;
                    }

                    public String getRegime() {
                        return mRegime;
                    }

                    public void setRegime(String regime) {
                        mRegime = regime;
                    }

                    public double getLongitude() {
                        return mLongitude;
                    }

                    public void setLongitude(double longitude) {
                        mLongitude = longitude;
                    }

                    public double getSemiMajorAxisKm() {
                        return mSemiMajorAxisKm;
                    }

                    public void setSemiMajorAxisKm(double semiMajorAxisKm) {
                        mSemiMajorAxisKm = semiMajorAxisKm;
                    }

                    public double getEccentricity() {
                        return mEccentricity;
                    }

                    public void setEccentricity(double eccentricity) {
                        mEccentricity = eccentricity;
                    }

                    public double getPeriapsisKm() {
                        return mPeriapsisKm;
                    }

                    public void setPeriapsisKm(double periapsisKm) {
                        mPeriapsisKm = periapsisKm;
                    }

                    public double getApoapsisKm() {
                        return mApoapsisKm;
                    }

                    public void setApoapsisKm(double apoapsisKm) {
                        mApoapsisKm = apoapsisKm;
                    }

                    public double getInclinationDeg() {
                        return mInclinationDeg;
                    }

                    public void setInclinationDeg(double inclinationDeg) {
                        mInclinationDeg = inclinationDeg;
                    }

                    public double getPeriodMin() {
                        return mPeriodMin;
                    }

                    public void setPeriodMin(double periodMin) {
                        mPeriodMin = periodMin;
                    }

                    public double getLifespanYears() {
                        return mLifespanYears;
                    }

                    public void setLifespanYears(double lifespanYears) {
                        mLifespanYears = lifespanYears;
                    }

                    public String getEpoch() {
                        return mEpoch;
                    }

                    public void setEpoch(String epoch) {
                        mEpoch = epoch;
                    }

                    public double getMeanMotion() {
                        return mMeanMotion;
                    }

                    public void setMeanMotion(double meanMotion) {
                        mMeanMotion = meanMotion;
                    }

                    public double getRaan() {
                        return mRaan;
                    }

                    public void setRaan(double raan) {
                        mRaan = raan;
                    }

                    public double getArgOfPericenter() {
                        return mArgOfPericenter;
                    }

                    public void setArgOfPericenter(double argOfPericenter) {
                        mArgOfPericenter = argOfPericenter;
                    }

                    public double getMeanAnomaly() {
                        return mMeanAnomaly;
                    }

                    public void setMeanAnomaly(double meanAnomaly) {
                        mMeanAnomaly = meanAnomaly;
                    }
                }
            }
        }

        public static class FairingsBean {
            /**
             * reused : false
             * recovery_attempt : false
             * recovered : false
             * ship : null
             */

            @SerializedName("reused")
            private boolean mReused;
            @SerializedName("recovery_attempt")
            private boolean mRecoveryAttempt;
            @SerializedName("recovered")
            private boolean mRecovered;
            @SerializedName("ship")
            private Object mShip;

            public boolean isReused() {
                return mReused;
            }

            public void setReused(boolean reused) {
                mReused = reused;
            }

            public boolean isRecoveryAttempt() {
                return mRecoveryAttempt;
            }

            public void setRecoveryAttempt(boolean recoveryAttempt) {
                mRecoveryAttempt = recoveryAttempt;
            }

            public boolean isRecovered() {
                return mRecovered;
            }

            public void setRecovered(boolean recovered) {
                mRecovered = recovered;
            }

            public Object getShip() {
                return mShip;
            }

            public void setShip(Object ship) {
                mShip = ship;
            }
        }
    }

    public static class TelemetryBean {
        /**
         * flight_club : https://www.flightclub.io/results/?code=TS19V
         */

        @SerializedName("flight_club")
        private String mFlightClub;

        public String getFlightClub() {
            return mFlightClub;
        }

        public void setFlightClub(String flightClub) {
            mFlightClub = flightClub;
        }
    }

    public static class LaunchSiteBean {
        /**
         * site_id : ccafs_slc_40
         * site_name : CCAFS SLC 40
         * site_name_long : Cape Canaveral Air Force Station Space Launch Complex 40
         */

        @SerializedName("site_id")
        private String mSiteId;
        @SerializedName("site_name")
        private String mSiteName;
        @SerializedName("site_name_long")
        private String mSiteNameLong;

        public String getSiteId() {
            return mSiteId;
        }

        public void setSiteId(String siteId) {
            mSiteId = siteId;
        }

        public String getSiteName() {
            return mSiteName;
        }

        public void setSiteName(String siteName) {
            mSiteName = siteName;
        }

        public String getSiteNameLong() {
            return mSiteNameLong;
        }

        public void setSiteNameLong(String siteNameLong) {
            mSiteNameLong = siteNameLong;
        }
    }

    public static class LinksBean {
        /**
         * mission_patch : https://images2.imgbox.com/c5/53/5jklZkPz_o.png
         * mission_patch_small : https://images2.imgbox.com/12/7c/NiniYxoh_o.png
         * reddit_campaign : https://www.reddit.com/r/spacex/comments/8w19yg/telstar_19v_launch_campaign_thread/
         * reddit_launch : https://www.reddit.com/r/spacex/comments/90p1a6/rspacex_telstar_19v_official_launch_discussion/
         * reddit_recovery : null
         * reddit_media : https://www.reddit.com/r/spacex/comments/90oxrr/rspacex_telstar_19v_media_thread_videos_images/
         * presskit : http://www.spacex.com/sites/spacex/files/telstar19vantagepresskit.pdf
         * article_link : https://spaceflightnow.com/2018/07/22/spacex-delivers-for-telesat-with-successful-early-morning-launch/
         * wikipedia : https://en.wikipedia.org/wiki/Telstar_19V
         * video_link : https://www.youtube.com/watch?v=xybp6zLaGx4
         * youtube_id : xybp6zLaGx4
         * flickr_images : ["https://farm1.staticflickr.com/856/28684550147_49802752b3_o.jpg","https://farm1.staticflickr.com/927/28684552447_956a9744f1_o.jpg","https://farm2.staticflickr.com/1828/29700007298_8ac5891d2c_o.jpg","https://farm1.staticflickr.com/914/29700004918_31ed7b73ef_o.jpg","https://farm1.staticflickr.com/844/29700002748_3047e50a0a_o.jpg","https://farm2.staticflickr.com/1786/29700000688_2514cd3cbb_o.jpg"]
         */

        @SerializedName("mission_patch")
        private String mMissionPatch;
        @SerializedName("mission_patch_small")
        private String mMissionPatchSmall;
        @SerializedName("reddit_campaign")
        private String mRedditCampaign;
        @SerializedName("reddit_launch")
        private String mRedditLaunch;
        @SerializedName("reddit_recovery")
        private Object mRedditRecovery;
        @SerializedName("reddit_media")
        private String mRedditMedia;
        @SerializedName("presskit")
        private String mPresskit;
        @SerializedName("article_link")
        private String mArticleLink;
        @SerializedName("wikipedia")
        private String mWikipedia;
        @SerializedName("video_link")
        private String mVideoLink;
        @SerializedName("youtube_id")
        private String mYoutubeId;
        @SerializedName("flickr_images")
        private List<String> mFlickrImages;

        public String getMissionPatch() {
            return mMissionPatch;
        }

        public void setMissionPatch(String missionPatch) {
            mMissionPatch = missionPatch;
        }

        public String getMissionPatchSmall() {
            return mMissionPatchSmall;
        }

        public void setMissionPatchSmall(String missionPatchSmall) {
            mMissionPatchSmall = missionPatchSmall;
        }

        public String getRedditCampaign() {
            return mRedditCampaign;
        }

        public void setRedditCampaign(String redditCampaign) {
            mRedditCampaign = redditCampaign;
        }

        public String getRedditLaunch() {
            return mRedditLaunch;
        }

        public void setRedditLaunch(String redditLaunch) {
            mRedditLaunch = redditLaunch;
        }

        public Object getRedditRecovery() {
            return mRedditRecovery;
        }

        public void setRedditRecovery(Object redditRecovery) {
            mRedditRecovery = redditRecovery;
        }

        public String getRedditMedia() {
            return mRedditMedia;
        }

        public void setRedditMedia(String redditMedia) {
            mRedditMedia = redditMedia;
        }

        public String getPresskit() {
            return mPresskit;
        }

        public void setPresskit(String presskit) {
            mPresskit = presskit;
        }

        public String getArticleLink() {
            return mArticleLink;
        }

        public void setArticleLink(String articleLink) {
            mArticleLink = articleLink;
        }

        public String getWikipedia() {
            return mWikipedia;
        }

        public void setWikipedia(String wikipedia) {
            mWikipedia = wikipedia;
        }

        public String getVideoLink() {
            return mVideoLink;
        }

        public void setVideoLink(String videoLink) {
            mVideoLink = videoLink;
        }

        public String getYoutubeId() {
            return mYoutubeId;
        }

        public void setYoutubeId(String youtubeId) {
            mYoutubeId = youtubeId;
        }

        public List<String> getFlickrImages() {
            return mFlickrImages;
        }

        public void setFlickrImages(List<String> flickrImages) {
            mFlickrImages = flickrImages;
        }
    }

    public static class TimelineBean {
        /**
         * webcast_liftoff : 899
         * go_for_prop_loading : -2280
         * rp1_loading : -2100
         * stage1_lox_loading : -2100
         * stage2_lox_loading : -960
         * engine_chill : -420
         * prelaunch_checks : -60
         * propellant_pressurization : -60
         * go_for_launch : -45
         * ignition : -3
         * liftoff : 0
         * maxq : 72
         * meco : 150
         * stage_sep : 153
         * second_stage_ignition : 154
         * fairing_deploy : 220
         * first_stage_entry_burn : 372
         * seco-1 : 492
         * first_stage_landing : 509
         * second_stage_restart : 1609
         * seco-2 : 1659
         * payload_deploy : 1960
         */

        @SerializedName("webcast_liftoff")
        private int mWebcastLiftoff;
        @SerializedName("go_for_prop_loading")
        private int mGoForPropLoading;
        @SerializedName("rp1_loading")
        private int mRp1Loading;
        @SerializedName("stage1_lox_loading")
        private int mStage1LoxLoading;
        @SerializedName("stage2_lox_loading")
        private int mStage2LoxLoading;
        @SerializedName("engine_chill")
        private int mEngineChill;
        @SerializedName("prelaunch_checks")
        private int mPrelaunchChecks;
        @SerializedName("propellant_pressurization")
        private int mPropellantPressurization;
        @SerializedName("go_for_launch")
        private int mGoForLaunch;
        @SerializedName("ignition")
        private int mIgnition;
        @SerializedName("liftoff")
        private int mLiftoff;
        @SerializedName("maxq")
        private int mMaxq;
        @SerializedName("meco")
        private int mMeco;
        @SerializedName("stage_sep")
        private int mStageSep;
        @SerializedName("second_stage_ignition")
        private int mSecondStageIgnition;
        @SerializedName("fairing_deploy")
        private int mFairingDeploy;
        @SerializedName("first_stage_entry_burn")
        private int mFirstStageEntryBurn;
        @SerializedName("seco-1")
        private int mSeco1;
        @SerializedName("first_stage_landing")
        private int mFirstStageLanding;
        @SerializedName("second_stage_restart")
        private int mSecondStageRestart;
        @SerializedName("seco-2")
        private int mSeco2;
        @SerializedName("payload_deploy")
        private int mPayloadDeploy;

        public int getWebcastLiftoff() {
            return mWebcastLiftoff;
        }

        public void setWebcastLiftoff(int webcastLiftoff) {
            mWebcastLiftoff = webcastLiftoff;
        }

        public int getGoForPropLoading() {
            return mGoForPropLoading;
        }

        public void setGoForPropLoading(int goForPropLoading) {
            mGoForPropLoading = goForPropLoading;
        }

        public int getRp1Loading() {
            return mRp1Loading;
        }

        public void setRp1Loading(int rp1Loading) {
            mRp1Loading = rp1Loading;
        }

        public int getStage1LoxLoading() {
            return mStage1LoxLoading;
        }

        public void setStage1LoxLoading(int stage1LoxLoading) {
            mStage1LoxLoading = stage1LoxLoading;
        }

        public int getStage2LoxLoading() {
            return mStage2LoxLoading;
        }

        public void setStage2LoxLoading(int stage2LoxLoading) {
            mStage2LoxLoading = stage2LoxLoading;
        }

        public int getEngineChill() {
            return mEngineChill;
        }

        public void setEngineChill(int engineChill) {
            mEngineChill = engineChill;
        }

        public int getPrelaunchChecks() {
            return mPrelaunchChecks;
        }

        public void setPrelaunchChecks(int prelaunchChecks) {
            mPrelaunchChecks = prelaunchChecks;
        }

        public int getPropellantPressurization() {
            return mPropellantPressurization;
        }

        public void setPropellantPressurization(int propellantPressurization) {
            mPropellantPressurization = propellantPressurization;
        }

        public int getGoForLaunch() {
            return mGoForLaunch;
        }

        public void setGoForLaunch(int goForLaunch) {
            mGoForLaunch = goForLaunch;
        }

        public int getIgnition() {
            return mIgnition;
        }

        public void setIgnition(int ignition) {
            mIgnition = ignition;
        }

        public int getLiftoff() {
            return mLiftoff;
        }

        public void setLiftoff(int liftoff) {
            mLiftoff = liftoff;
        }

        public int getMaxq() {
            return mMaxq;
        }

        public void setMaxq(int maxq) {
            mMaxq = maxq;
        }

        public int getMeco() {
            return mMeco;
        }

        public void setMeco(int meco) {
            mMeco = meco;
        }

        public int getStageSep() {
            return mStageSep;
        }

        public void setStageSep(int stageSep) {
            mStageSep = stageSep;
        }

        public int getSecondStageIgnition() {
            return mSecondStageIgnition;
        }

        public void setSecondStageIgnition(int secondStageIgnition) {
            mSecondStageIgnition = secondStageIgnition;
        }

        public int getFairingDeploy() {
            return mFairingDeploy;
        }

        public void setFairingDeploy(int fairingDeploy) {
            mFairingDeploy = fairingDeploy;
        }

        public int getFirstStageEntryBurn() {
            return mFirstStageEntryBurn;
        }

        public void setFirstStageEntryBurn(int firstStageEntryBurn) {
            mFirstStageEntryBurn = firstStageEntryBurn;
        }

        public int getSeco1() {
            return mSeco1;
        }

        public void setSeco1(int seco1) {
            mSeco1 = seco1;
        }

        public int getFirstStageLanding() {
            return mFirstStageLanding;
        }

        public void setFirstStageLanding(int firstStageLanding) {
            mFirstStageLanding = firstStageLanding;
        }

        public int getSecondStageRestart() {
            return mSecondStageRestart;
        }

        public void setSecondStageRestart(int secondStageRestart) {
            mSecondStageRestart = secondStageRestart;
        }

        public int getSeco2() {
            return mSeco2;
        }

        public void setSeco2(int seco2) {
            mSeco2 = seco2;
        }

        public int getPayloadDeploy() {
            return mPayloadDeploy;
        }

        public void setPayloadDeploy(int payloadDeploy) {
            mPayloadDeploy = payloadDeploy;
        }
    }
}
