package com.lixin.exam.di;

import com.lixin.exam.components.arouter.ArouterManager;

import dagger.Module;
import dagger.Provides;

@Module
public class ArouterModule {
    @Provides
    public static ArouterManager provideArouterManager() {
        return new ArouterManager();
    }
}
