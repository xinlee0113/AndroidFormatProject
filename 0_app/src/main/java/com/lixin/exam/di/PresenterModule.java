package com.lixin.exam.di;

import com.lixin.exam.main.test.TestContract;
import com.lixin.exam.main.test.TestPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PresenterModule {

    @Binds
    abstract TestContract.Presenter test(TestPresenter testPresenter);
}
