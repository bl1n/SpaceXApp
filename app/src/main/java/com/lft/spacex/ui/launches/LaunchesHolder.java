package com.lft.spacex.ui.launches;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.model.launches.Launch;

class LaunchesHolder extends RecyclerView.ViewHolder {

    private TextView mTvTittle;

    public LaunchesHolder(@NonNull View itemView) {
        super(itemView);
        mTvTittle = itemView.findViewById(R.id.tv_launch_tittle);
    }

    public void bind(Launch launch, LaunchesAdapter.OnItemClickListener onItemClickListener){
        final String text =launch.getLaunchYear()  + " " + launch.getDetails();
        mTvTittle.setText(text);
        if (onItemClickListener != null) {
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(
                    launch.getFlightNumber()
            ));
        }
    }
}
