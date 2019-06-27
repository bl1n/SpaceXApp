package com.lft.spacex.data;

import com.lft.spacex.model.CompanyInfo;
import com.lft.spacex.model.histories.HistoryEvent;
import com.lft.spacex.model.launches.Launch;
import com.lft.spacex.model.launches.LaunchesResponse;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SpaceXApi {

    @GET("history")
    Single<List<HistoryEvent>> getHistoryEvents();

    @GET("history/{id}")
    Single<HistoryEvent> getHistoryEvent(@Path("id") int id);

    @GET("info")
    Single<CompanyInfo> getCompanyInfo();

    @GET("launches")
    Single<List<Launch>> getLaunches();


    @GET("launches/{flight_number}")
    Single<LaunchesResponse> getLaunch(@Path("id") long flightNumber);
}
