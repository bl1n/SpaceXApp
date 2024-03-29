package com.lft.spacex.data.api;
import com.lft.spacex.data.model.CompanyInfo;
import com.lft.spacex.data.model.histories.HistoryEvent;
import com.lft.spacex.data.model.launches.Launch;
import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SpaceXApi {

    @GET("history")
    Single<List<HistoryEvent>> getHistoryEvents();

    @GET("history/{id}")
    Single<HistoryEvent> getHistoryEvent(@Path("id") int id);

    @GET("launches/{id}")
    Single<Launch> getLaunch(@Path("id") int id);

    @GET("info")
    Single<CompanyInfo> getCompanyInfo();

    @GET("launches")
    Single<List<Launch>> getLaunches();

}
