package com.lixin.exam.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 *将modules关联起来
 *
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        ArouterModule.class,
        PresenterModule.class})
public interface MainAppComponent extends AndroidInjector<DaggerApp> {

    @Component.Factory
    abstract class Factory implements AndroidInjector.Factory<DaggerApp> {

    }
}
