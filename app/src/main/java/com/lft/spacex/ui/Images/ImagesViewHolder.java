package com.lft.spacex.ui.Images;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.lft.spacex.R;
import com.lft.spacex.data.model.LaunchImage;
import com.squareup.picasso.Picasso;

class ImagesViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;

    public ImagesViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView  = itemView.findViewById(R.id.li_iv);
    }


    public void bind(LaunchImage image) {
        Picasso.get().load(image.getUrl()).into(mImageView);
    }
}
