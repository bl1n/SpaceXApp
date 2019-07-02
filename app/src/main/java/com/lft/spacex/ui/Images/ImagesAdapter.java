package com.lft.spacex.ui.Images;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lft.spacex.R;
import com.lft.spacex.data.model.LaunchImage;

import java.util.ArrayList;
import java.util.List;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesViewHolder> {

    private final List<LaunchImage> mImages = new ArrayList<>();

    @NonNull
    @Override
    public ImagesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.li_image, viewGroup,false);

        return new ImagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagesViewHolder imagesViewHolder, int i) {

        LaunchImage image = mImages.get(i);
        imagesViewHolder.bind(image);
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public void addData(List<LaunchImage> images, boolean isRefreshed) {
        if (isRefreshed) {
            mImages.clear();
        }
        if(images!=null){
            mImages.addAll(images);
            notifyDataSetChanged();
        }

    }
}
