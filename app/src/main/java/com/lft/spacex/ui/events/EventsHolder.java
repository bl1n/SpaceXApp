package com.lft.spacex.ui.events;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.model.histories.HistoryEvent;

public class EventsHolder extends RecyclerView.ViewHolder {


    private final TextView mTvAllText;

    public EventsHolder(@NonNull View itemView) {
        super(itemView);
        mTvAllText = itemView.findViewById(R.id.tv_all_text);
    }

    public void bind(HistoryEvent event, EventsAdapter.OnItemClickListener onItemClickListener){
        mTvAllText.setText(event.toString());

        if (onItemClickListener != null) {
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(
                    event.getId()
            ));
        }
    }
}
