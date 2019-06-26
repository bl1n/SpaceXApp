package com.lft.spacex.model.histories;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpaceXHistoryResponse {

    @SerializedName("historyEvents")
    private List<HistoryEvent> mEvents;

    public List<HistoryEvent> getEvents() {
        return mEvents;
    }

    public void setEvents(List<HistoryEvent> events) {
        mEvents = events;
    }
}
