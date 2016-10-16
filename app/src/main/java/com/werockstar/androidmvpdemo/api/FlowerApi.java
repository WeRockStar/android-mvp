package com.werockstar.androidmvpdemo.api;

import com.werockstar.androidmvpdemo.model.FlowersCollection;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FlowerApi {

    @GET("feeds/flowers.json")
    Call<List<FlowersCollection>> getFlowerList();
}
