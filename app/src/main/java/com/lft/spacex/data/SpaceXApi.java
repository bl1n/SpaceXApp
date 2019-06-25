package com.lft.spacex.data;

import com.lft.spacex.model.histories.Company;
import com.lft.spacex.model.histories.HistoryEvent;
import com.lft.spacex.model.launches.LaunchesResponse;
import com.lft.spacex.model.launches.SpaceXHistoryResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SpaceXApi {

    @GET("history")
    Single<SpaceXHistoryResponse> getHistoryEvents();

    @GET("history/{id}")
    Single<HistoryEvent> getHistoryEvent(@Path("id") int id);

    @GET("info")
    Single<Company> getCompanyInfo();

    @GET("launches/latest")
    Single<LaunchesResponse> getLaunches();
}
