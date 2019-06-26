package com.lft.spacex.ui.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lft.spacex.R;
import com.lft.spacex.model.histories.HistoryEvent;

import java.util.ArrayList;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsHolder> {


    private final List<HistoryEvent> mEvents = new ArrayList<>();

    private final OnItemClickListener mOnItemClickListener;

    public EventsAdapter(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }


    @NonNull
    @Override
    public EventsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.li_events, viewGroup, false );

        return new EventsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsHolder viewHolder, int i) {

        HistoryEvent historyEvent = mEvents.get(i);
        viewHolder.bind(historyEvent, mOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public void addData(List<HistoryEvent> data, boolean isRefreshed) {
        if (isRefreshed) {
            mEvents.clear();
        }
        mEvents.addAll(data);
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {

        void onItemClick(int id);
    }
}
