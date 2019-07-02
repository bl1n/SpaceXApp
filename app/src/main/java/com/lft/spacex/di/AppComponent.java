package com.lft.spacex.di;

import com.lft.spacex.ui.Images.ImagesFragment;
import com.lft.spacex.ui.Images.ImagesPresenter;
import com.lft.spacex.ui.companyInfo.CompanyInfoFragment;
import com.lft.spacex.ui.companyInfo.CompanyInfoPresenter;
import com.lft.spacex.ui.history.EventsFragment;
import com.lft.spacex.ui.history.EventsPresenter;
import com.lft.spacex.ui.history.event.EventFragment;
import com.lft.spacex.ui.history.event.EventPresenter;
import com.lft.spacex.ui.launches.LaunchesFragment;
import com.lft.spacex.ui.launches.LaunchesPresenter;
import com.lft.spacex.ui.launches.launch.LaunchFragment;
import com.lft.spacex.ui.launches.launch.LaunchPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {

    void inject(LaunchesFragment injector);

    void inject(CompanyInfoFragment injector);

    void inject(EventFragment injector);

    void inject(LaunchFragment injector);

    void inject(EventsFragment injector);

    void inject(EventsPresenter injector);

    void inject(EventPresenter injector);

    void inject(LaunchesPresenter injector);

    void inject(LaunchPresenter injector);

    void inject(ImagesFragment injector);

    void inject(ImagesPresenter injector);

}
