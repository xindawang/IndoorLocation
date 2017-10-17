package com.example.acer.indoorlocation;

import android.app.Application;

import com.fengmap.android.FMMapSDK;

/**
 * Created by ACER on 2017/10/17.
 */

public class MapApplication extends Application {
    @Override
    public void onCreate() {
        //初始化SDK
        FMMapSDK.init(this);
        super.onCreate();
    }
}
