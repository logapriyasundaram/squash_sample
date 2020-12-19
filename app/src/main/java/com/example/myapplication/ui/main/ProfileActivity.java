package com.example.myapplication.ui.main;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.product.annotationbuilder.ProductBindView;
import com.product.process.annotation.Initialize;

import dagger.android.DaggerActivity;

public class ProfileActivity extends BaseActivity {


    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.toolbar)
    Toolbar toolbar;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.recyclerView)
    RecyclerView recyclerView;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.rlVideo)
    RelativeLayout rlVideo;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.rlLike)
    RelativeLayout rlLike;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.llGoneVideo)
    LinearLayout llGoneVideo;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.llGoneLike)
    LinearLayout llGoneLike;
    @SuppressLint("NonConstantResourceId")
    @Initialize(R.id.imgmenu)
    ImageView imgmenu;

    @Override
    protected int layoutRes() {
        return R.layout.activity_profile;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProductBindView.bind(this);


       /* toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_menu));
*/
        ItemAdapter itemAdapter = new ItemAdapter(this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.notifyDataSetChanged();

        rlVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llGoneLike.setVisibility(View.VISIBLE);
                llGoneVideo.setVisibility(View.GONE);
            }
        });
        rlLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llGoneLike.setVisibility(View.GONE);
                llGoneVideo.setVisibility(View.VISIBLE);
            }
        });

        imgmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCategoryMenu();
            }
        });

    }

    private void showCategoryMenu() {
        final CategoryDropdownMenu menu = new CategoryDropdownMenu(this);
        menu.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        menu.setWidth(getPxFromDp(150));
        menu.setOutsideTouchable(true);
        menu.setFocusable(true);
        menu.setBackgroundDrawable(getResources().getDrawable(R.drawable.background_feature));
        menu.showAsDropDown(imgmenu);

    }

    //Convert DP to Pixel
    private int getPxFromDp(int dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }
}
