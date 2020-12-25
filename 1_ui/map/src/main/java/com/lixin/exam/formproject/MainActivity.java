package com.lixin.exam.formproject;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}