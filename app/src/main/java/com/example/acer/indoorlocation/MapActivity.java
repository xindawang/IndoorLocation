package com.example.acer.indoorlocation;

import android.app.Activity;
import android.os.Bundle;

import com.fengmap.android.map.FMMap;
import com.fengmap.android.map.FMMapView;

/**
 * Created by ACER on 2017/10/17.
 */

public class MapActivity extends Activity {
    FMMap mFMMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FMMapView mapView = (FMMapView) findViewById(R.id.mapview);
        mFMMap = mapView.getFMMap();       //获取地图操作对象

        String bid = "10380";             //地图id
        mFMMap.openMapById(bid, true);          //打开地图
    }

    @Override
    public void onBackPressed() {
        if (mFMMap != null) {
            mFMMap.onDestroy();
        }
        super.onBackPressed();
    }
}