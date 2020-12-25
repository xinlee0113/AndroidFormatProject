package com.lixin.exam.components.arouter;


import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ArouterManager {

    private static final String TAG = "ArouterManager";

    @Inject
    public ArouterManager() {
    }

    public void init(){
        Log.i(TAG,"init");
    }
}
