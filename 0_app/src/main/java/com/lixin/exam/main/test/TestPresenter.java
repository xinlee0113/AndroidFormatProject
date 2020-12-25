package com.lixin.exam.main.test;

import android.util.Log;

import javax.inject.Inject;

public class TestPresenter implements TestContract.Presenter {
    private static final String TAG = "TestPresenter";

    @Inject
    public TestPresenter(){

    }

    @Override
    public void performTest() {
        Log.i(TAG,"performTest");
    }
}
