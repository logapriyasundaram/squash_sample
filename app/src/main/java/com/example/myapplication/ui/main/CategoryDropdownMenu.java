package com.example.myapplication.ui.main;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import com.example.myapplication.R;

/**
 * Created by Admin2 on 10/Jul/2018.
 */

public class CategoryDropdownMenu extends PopupWindow {
    private Context context;


    public CategoryDropdownMenu(Context context){
        super(context);
        this.context = context;
        setupView();
    }


    private void setupView() {
        View view = LayoutInflater.from(context).inflate(R.layout.popup_category, null);


        setContentView(view);
    }
}
