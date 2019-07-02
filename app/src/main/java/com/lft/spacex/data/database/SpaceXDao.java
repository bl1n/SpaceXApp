package com.lft.spacex.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.lft.spacex.data.model.LaunchImage;

import java.util.List;

@Dao
public interface SpaceXDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLaunchImages(List<LaunchImage> images);

    @Query("select * from launchimage")
    List<LaunchImage> getLaunchImages();

    @Query("select *from launchimage where flight_number = :flightNumber")
    List<LaunchImage> getLaunchImagesByFlightNumber(int flightNumber);

}
