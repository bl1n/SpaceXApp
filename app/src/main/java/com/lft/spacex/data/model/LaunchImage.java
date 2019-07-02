package com.lft.spacex.data.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity
public class LaunchImage implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private int mId;

    @ColumnInfo(name = "url")
    @SerializedName("url")
    private String mUrl;

    @ColumnInfo(name = "flight_number")
    @SerializedName("flight_number")
    private int mFlightNumber;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public int getFlightNumber() {
        return mFlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        mFlightNumber = flightNumber;
    }
}
