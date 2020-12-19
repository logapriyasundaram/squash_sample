package com.example.myapplication.di.module;




import com.example.myapplication.ui.main.ProfileActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {



    @ContributesAndroidInjector
    abstract ProfileActivity bindMainActivity();


}
