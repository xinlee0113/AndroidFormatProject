package com.lixin.exam.main.test;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.lixin.exam.main.R;

import javax.inject.Inject;

public class TestView extends RelativeLayout implements TestContract.View {
    private static final String TAG = "TestView";

    @Inject
    TestContract.Presenter presenter;

    public TestView(Context context) {
        this(context, null);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_test, this);
        findViewById(R.id.bt_test).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onTestClicked();
            }
        });
    }


    @Override
    public void showTestResult() {
        Log.i(TAG, "showTestResult");
    }

    @Override
    public void onTestClicked() {
        presenter.performTest();
    }

}
