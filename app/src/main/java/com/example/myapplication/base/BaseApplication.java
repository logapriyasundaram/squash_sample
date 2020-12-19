package com.example.myapplication.base;




import com.example.myapplication.di.component.ApplicationComponent;
import com.example.myapplication.di.component.DaggerApplicationComponent;

import javax.inject.Singleton;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

@Singleton
public class BaseApplication extends DaggerApplication {

    private static BaseApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);
        return component;
    }

    public static BaseApplication getBaseApplication() {
        return baseApplication;
    }
}
