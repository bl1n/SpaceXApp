package com.lft.spacex.ui.events;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.model.histories.HistoryEvent;

import java.util.List;

import io.reactivex.annotations.NonNull;

public interface EventsView extends BaseView {

    void showHistories(@NonNull List<HistoryEvent> events);

    void openEvent(@NonNull int id);
}
