package com.example.myapplication.di.factory;



import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;

public class ViewModelFactory implements ViewModelProvider.Factory {


    @Inject
    public ViewModelFactory( ){
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
       
        return null;
    }
}
