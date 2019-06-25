package com.lft.spacex.di;


import android.content.Context;

import com.lft.spacex.AppDelegate;

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

//    @Provides
//    @Singleton
//    Storage provideStorage() {
//        final BehanceDatabase database = Room.databaseBuilder(mApp, BehanceDatabase.class, "behance_database")
//                .fallbackToDestructiveMigration()
//                .build();
//
//        return new Storage(database.getBehanceDao());
//    }
}
