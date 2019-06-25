package com.lft.spacex;

import android.app.Application;

import com.lft.spacex.di.AppComponent;
import com.lft.spacex.di.AppModule;
import com.lft.spacex.di.DaggerAppComponent;
import com.lft.spacex.di.NetworkModule;

public class AppDelegate extends Application {

    private static AppComponent sAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return sAppComponent;
    }
}
