package com.lft.spacex.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.lft.spacex.data.model.LaunchImage;

@Database(entities = {LaunchImage.class}, version = 1)
public abstract class SpaceXDatabase extends RoomDatabase {
    public abstract SpaceXDao getDao();
}
