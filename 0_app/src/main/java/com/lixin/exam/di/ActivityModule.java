package com.lixin.exam.di;

import com.lixin.exam.main.MainActivity;
import com.lixin.exam.main.test.TestView;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Module 提供内容
 */
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = {ArouterModule.class, PresenterModule.class})
    abstract public MainActivity injectToMainActivity();

    @ContributesAndroidInjector(modules = PresenterModule.class)
    abstract public TestView injectToTestView();

}
