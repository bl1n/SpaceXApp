package com.lft.spacex.data;

import android.arch.lifecycle.LiveData;

import com.lft.spacex.data.database.SpaceXDao;
import com.lft.spacex.data.model.LaunchImage;
import com.lft.spacex.data.model.launches.Launch;
import com.lft.spacex.data.model.launches.LaunchesResponse;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;

public class Storage {
    private SpaceXDao mDao;

    public Storage(SpaceXDao dao) {
        mDao = dao;
    }

    public void insertLaunchImages(List<Launch>launches){
        List<LaunchImage> launchImages = new ArrayList<>();
        for(Launch launch: launches){
            for(String url: launch.getLinks().getFlickrImages()){
                LaunchImage launchImage = new LaunchImage();
                launchImage.setFlightNumber(launch.getFlightNumber());
                launchImage.setUrl(url);
                launchImages.add(launchImage);
            }
        }
        mDao.insertLaunchImages(launchImages);
    }

    public List<LaunchImage> getLaunchImages(){
        return mDao.getLaunchImages();
    }

    public int getLaunchImagesSize(){
        return mDao.getLaunchImages().size();
    }

    public List<LaunchImage> getLaunchImagesByFlightNumber(int flightNumber){
        return mDao.getLaunchImagesByFlightNumber(flightNumber);
    }


}
