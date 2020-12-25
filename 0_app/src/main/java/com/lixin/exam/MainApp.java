package com.lixin.exam;

import android.util.Log;

import com.lixin.exam.di.DaggerApp;

public class MainApp extends DaggerApp {
    private static final String TAG = "MainApp";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");
    }
}
