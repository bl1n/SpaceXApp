package com.lft.spacex.ui.events;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lft.spacex.model.histories.HistoryEvent;

import java.util.ArrayList;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter {


    private final List<HistoryEvent> mEvents = new ArrayList<>();

    private final OnItemClickListener mOnItemClickListener;

    public EventsAdapter(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public interface OnItemClickListener {

        void onItemClick(int id);
    }
}
