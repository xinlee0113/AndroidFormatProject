package com.lixin.exam.main;

import android.os.Bundle;
import android.view.View;

import com.lixin.exam.components.arouter.ArouterManager;
import com.lixin.exam.main.test.TestContract;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    @Inject
    TestContract.Presenter presenter;
    @Inject
    ArouterManager arouterManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arouterManager.init();
    }

    public void test(View view) {
        presenter.performTest();
    }
}
