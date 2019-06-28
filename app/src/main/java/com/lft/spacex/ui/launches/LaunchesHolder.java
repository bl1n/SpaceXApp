package com.lft.spacex.ui.launches;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.model.launches.Launch;
import com.lft.spacex.utils.DateUtils;

class LaunchesHolder extends RecyclerView.ViewHolder {

    private TextView mTvTittle;

    public LaunchesHolder(@NonNull View itemView) {
        super(itemView);
        mTvTittle = itemView.findViewById(R.id.tv_launch_tittle);
    }

    public void bind(Launch launch, LaunchesAdapter.OnItemClickListener onItemClickListener){
        final String text = DateUtils.format(launch.getLaunchDateUnix())  + " " + launch.getMissionName();
        mTvTittle.setText(text);

        if(launch.isLaunchSuccess()){
            mTvTittle.setTextColor(mTvTittle.getContext().getResources().getColor(R.color.accent));
        } else
            mTvTittle.setTextColor(mTvTittle.getContext().getResources().getColor(R.color.colorAccent));
        if (onItemClickListener != null) {
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(
                    launch.getFlightNumber()
            ));
        }
    }
}
