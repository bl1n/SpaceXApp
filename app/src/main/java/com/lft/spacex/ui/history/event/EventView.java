package com.lft.spacex.ui.history.event;

import com.lft.spacex.common.BaseView;
import com.lft.spacex.data.model.histories.HistoryEvent;

interface EventView extends BaseView {
    void showEvent(HistoryEvent event);
}
