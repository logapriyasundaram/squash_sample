package com.example.myapplication.di.utils;


public class ApiUtility {
    private static final ApiUtility ourInstance = new ApiUtility();

    public static ApiUtility getInstance() {
        return ourInstance;
    }

    private ApiUtility() {
    }


}
