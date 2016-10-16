package com.werockstar.androidmvpdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {


    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class FlowerViewHolder extends RecyclerView.ViewHolder {

        public FlowerViewHolder(View itemView) {
            super(itemView);
        }
    }
}
