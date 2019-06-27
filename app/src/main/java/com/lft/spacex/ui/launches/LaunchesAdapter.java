package com.lft.spacex.ui.launches;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lft.spacex.R;
import com.lft.spacex.model.launches.Launch;

import java.util.ArrayList;
import java.util.List;

public class LaunchesAdapter extends RecyclerView.Adapter<LaunchesHolder> {

    private final List<Launch> mLaunches = new ArrayList<>();
    private final OnItemClickListener mOnItemClickListener;

    @NonNull
    @Override
    public LaunchesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.li_launches, viewGroup,false);
        return new LaunchesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchesHolder launchesHolder, int i) {

        Launch launch = mLaunches.get(i);
        launchesHolder.bind(launch, mOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return mLaunches.size();
    }
    public void addData(List<Launch> data, boolean isRefreshed){
        if (isRefreshed) {
            mLaunches.clear();
        }
        mLaunches.addAll(data);
        notifyDataSetChanged();
    }

    public LaunchesAdapter(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        void onItemClick(int id);
    }
}
