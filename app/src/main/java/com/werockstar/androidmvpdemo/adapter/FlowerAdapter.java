package com.werockstar.androidmvpdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.werockstar.androidmvpdemo.R;
import com.werockstar.androidmvpdemo.model.FlowersCollection;
import com.werockstar.androidmvpdemo.util.Constant;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    private List<FlowersCollection> flowerList;
    private Context mContext;

    public void setFlowerList(List<FlowersCollection> flowerList, Context context) {
        this.flowerList = flowerList;
        this.mContext = context;
    }

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_item_row, parent, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {
        holder.tvInstruction.setText(flowerList.get(position).getInstructions());
        String photoUrl = Constant.BASE_URL + "photos/" + flowerList.get(position).getPhotoName();

        Glide.with(mContext).load(photoUrl).into(holder.ivFlower);
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
