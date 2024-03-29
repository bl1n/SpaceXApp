package com.lft.spacex.ui.history;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.data.model.histories.HistoryEvent;

import java.util.List;

import io.reactivex.annotations.NonNull;

public interface EventsView extends BaseView {

    void showHistories(@NonNull List<HistoryEvent> events);

    void openHistoryEvent(@NonNull int id);
}
