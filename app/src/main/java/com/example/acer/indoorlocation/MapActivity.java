package com.example.acer.indoorlocation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

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

        // 离线加载地图数据，路径为地图文件所在sdcard的绝对位置
        String path = Environment.getExternalStorageDirectory() + "/fengmap/map/iotlab/iotlab.fmap";
        mFMMap.openMapByPath(path);
        // 离线加载地图主题，路径为地图主题所在sdcard的绝对位置
        String themePath = Environment.getExternalStorageDirectory() + "/fengmap/theme/iotlab/iotlab.theme";
        mFMMap.loadThemeByPath(themePath);


    }

    @Override
    public void onBackPressed() {
        if (mFMMap != null) {
            mFMMap.onDestroy();
        }
        super.onBackPressed();
    }
}