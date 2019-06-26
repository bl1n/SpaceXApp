package com.lft.spacex.data;

import com.lft.spacex.model.histories.Company;
import com.lft.spacex.model.histories.HistoryEvent;
import com.lft.spacex.model.launches.LaunchesResponse;
import com.lft.spacex.model.histories.SpaceXHistoryResponse;

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
    Single<Company> getCompanyInfo();

    @GET("launches/latest")
    Single<LaunchesResponse> getLaunches();
}
