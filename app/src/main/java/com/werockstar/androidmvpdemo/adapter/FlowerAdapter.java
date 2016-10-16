package com.werockstar.androidmvpdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.werockstar.androidmvpdemo.R;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_item_row, parent, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class FlowerViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFlower;
        TextView tvInstruction;

        public FlowerViewHolder(View itemView) {
            super(itemView);

            tvInstruction = (TextView) itemView.findViewById(R.id.tvInstruction);
            ivFlower = (ImageView) itemView.findViewById(R.id.ivFlower);
        }
    }
}
