package com.werockstar.androidmvpdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.werockstar.androidmvpdemo.R;
import com.werockstar.androidmvpdemo.model.FlowersCollection;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    private List<FlowersCollection> flowerList;

    public void setFlowerList(List<FlowersCollection> flowerList) {
        this.flowerList = flowerList;
    }

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_item_row, parent, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {
        holder.tvInstruction.setText(flowerList.get(position).getInstructions());
    }

    @Override
    public int getItemCount() {
        return flowerList == null ? 0 : flowerList.size();
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
