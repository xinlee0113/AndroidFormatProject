package com.lixin.exam.di;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * 将组件和应用关联起来
 * Dagger使用步骤
 * 1. 定义
 *
 */
public class DaggerApp extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMainAppComponent.factory().create(DaggerApp.this);
    }
}
