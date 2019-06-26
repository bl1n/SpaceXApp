package com.lft.spacex.di;

import com.lft.spacex.ui.events.EventsFragment;
import com.lft.spacex.ui.events.EventsPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(EventsPresenter injector);
    void inject(EventsFragment injector);

}
