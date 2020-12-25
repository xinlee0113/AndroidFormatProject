package com.lixin.exam.main.test;

import android.util.Log;

public class TestModel implements TestContract.Model {
    private static final String TAG = "TestModel";

    @Override
    public int actTest() {
        Log.i(TAG, "actTest");
        return 0;
    }
}
