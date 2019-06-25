package com.lft.spacex.ui.events;

import com.lft.spacex.common.PresenterFragment;
import com.lft.spacex.common.Refreshable;

public class EventsFragment extends PresenterFragment<EventsPresenter>
        implements Refreshable, EventsView, HistoriesAdapter.OnItemCLickListener  {
}
