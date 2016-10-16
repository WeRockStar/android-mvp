package com.werockstar.androidmvpdemo.presenter;


import com.werockstar.androidmvpdemo.api.FlowerApi;
import com.werockstar.androidmvpdemo.model.FlowersCollection;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FlowerPresenter {

    private FlowerApi api;
    private FlowerPresenter.View view;
    private Call<List<FlowersCollection>> call;

    public FlowerPresenter(FlowerApi api, View view) {
        this.api = api;
        this.view = view;
    }

    public interface View {
        void onDisplayFlower(List<FlowersCollection> flowers);

        void onGetFlowerError(String message);
    }

    public void getFlowerList() {
        call = api.getFlowerList();
        call.enqueue(new Callback<List<FlowersCollection>>() {
            @Override
            public void onResponse(Call<List<FlowersCollection>> call, Response<List<FlowersCollection>> response) {
                if (response.isSuccessful()) {
                    view.onDisplayFlower(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<FlowersCollection>> call, Throwable t) {
                view.onGetFlowerError(t.getMessage());
            }
        });
    }
}
