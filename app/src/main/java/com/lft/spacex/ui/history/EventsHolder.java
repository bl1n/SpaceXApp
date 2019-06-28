package com.lft.spacex.ui.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.data.model.histories.HistoryEvent;
import com.lft.spacex.utils.DateUtils;

public class EventsHolder extends RecyclerView.ViewHolder {


    private TextView mTittle;
    private TextView mDate;



    public EventsHolder(@NonNull View itemView) {
        super(itemView);
        mTittle = itemView.findViewById(R.id.tv_event_tittle);
        mDate = itemView.findViewById(R.id.tv_event_date);


    }

    public void bind(HistoryEvent event, EventsAdapter.OnItemClickListener onItemClickListener){
        mTittle.setText(event.getTitle());
        mDate.setText(DateUtils.format(event.getEventDateUnix()));


        if (onItemClickListener != null) {
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(
                    event.getId()
            ));
        }
    }
}
