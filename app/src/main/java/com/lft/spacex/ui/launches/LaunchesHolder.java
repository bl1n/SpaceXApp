package com.lft.spacex.ui.launches;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lft.spacex.R;
import com.lft.spacex.data.model.launches.Launch;
import com.lft.spacex.utils.DateUtils;
import com.squareup.picasso.Picasso;

class LaunchesHolder extends RecyclerView.ViewHolder {

    private TextView mTvTittle;
    private ImageView mPatchImage;

    public LaunchesHolder(@NonNull View itemView) {
        super(itemView);
        mTvTittle = itemView.findViewById(R.id.tv_launch_tittle);
        mPatchImage = itemView.findViewById(R.id.patch_image);
    }

    public void bind(Launch launch, LaunchesAdapter.OnItemClickListener onItemClickListener){
        final String text = DateUtils.format(launch.getLaunchDateUnix())  + "\n " + launch.getMissionName();
        mTvTittle.setText(text);
        Picasso.get().load(launch.getLinks().getMissionPatchSmall()).into(mPatchImage);

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
