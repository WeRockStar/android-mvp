package com.werockstar.androidmvpdemo.model;

import com.google.gson.annotations.SerializedName;

public class FlowersCollection {
    @SerializedName("category")
    private String category;

    @SerializedName("price")
    private float price;

    @SerializedName("instructions")
    private String instructions;

    @SerializedName("photo")
    private String photoName;

    @SerializedName("name")
    private String name;

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getPhotoName() {
        return photoName;
    }

    public String getName() {
        return name;
    }
}
