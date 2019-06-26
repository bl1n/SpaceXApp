package com.lft.spacex.ui.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.model.histories.HistoryEvent;

public class EventsHolder extends RecyclerView.ViewHolder {


    private TextView mTittle;
    private TextView mDate;
    private TextView mDetails;
    private TextView mReddit;
    private TextView mSpaceXURL;
    private TextView mWiki;


    public EventsHolder(@NonNull View itemView) {
        super(itemView);
        mTittle = itemView.findViewById(R.id.tv_event_tittle);
        mDate = itemView.findViewById(R.id.tv_event_date);
        mDetails = itemView.findViewById(R.id.tv_event_details);
        mReddit = itemView.findViewById(R.id.tv_event_reddit);
        mSpaceXURL = itemView.findViewById(R.id.tv_event_article);
        mWiki = itemView.findViewById(R.id.tv_event_wiki);

    }

    public void bind(HistoryEvent event, EventsAdapter.OnItemClickListener onItemClickListener){
        mTittle.setText(event.getTitle());
        mDate.setText(event.getEventDateUtc());
        mDetails.setText(event.getDetails());
        mReddit.setText(event.getLinks().getReddit());
        mSpaceXURL.setText(event.getLinks().getArticle());
        mWiki.setText(event.getLinks().getWikipedia());

        if (onItemClickListener != null) {
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(
                    event.getId()
            ));
        }
    }
}
