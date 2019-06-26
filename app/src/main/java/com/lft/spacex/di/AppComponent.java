package com.lft.spacex.di;

import com.lft.spacex.ui.history.EventsFragment;
import com.lft.spacex.ui.history.EventsPresenter;
import com.lft.spacex.ui.launches.LaunchesFragment;
import com.lft.spacex.ui.launches.LaunchesPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(EventsPresenter injector);
    void inject(LaunchesPresenter injector);
    void inject(EventsFragment injector);
    void inject(LaunchesFragment injector);

}
