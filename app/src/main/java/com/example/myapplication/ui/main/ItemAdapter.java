package com.example.myapplication.ui.main;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.R;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    Activity activity;

    public ItemAdapter(Activity tabcontacts) {
        this.activity = tabcontacts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item_photo, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tvPhoto;

        public ViewHolder(View itemView) {
            super(itemView);
            this.tvPhoto = itemView.findViewById(R.id.tvPhoto);

        }
    }
}
