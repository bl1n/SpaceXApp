package com.lft.spacex.di;


import android.arch.persistence.room.Room;
import android.content.Context;

import com.lft.spacex.AppDelegate;
import com.lft.spacex.data.Storage;
import com.lft.spacex.data.database.SpaceXDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final AppDelegate mApp;

    public AppModule(AppDelegate app) {
        mApp = app;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mApp;
    }

    @Provides
    @Singleton
    AppDelegate provideApp() {
        return mApp;
    }

    @Provides
    @Singleton
    Storage provideStorage() {
        final SpaceXDatabase database = Room.databaseBuilder(mApp, SpaceXDatabase.class, "spacex_database")
                .fallbackToDestructiveMigration()
                .build();

        return new Storage(database.getDao());
    }
}
