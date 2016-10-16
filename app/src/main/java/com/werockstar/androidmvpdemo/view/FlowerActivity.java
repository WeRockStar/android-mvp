package com.werockstar.androidmvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.werockstar.androidmvpdemo.R;
import com.werockstar.androidmvpdemo.adapter.FlowerAdapter;
import com.werockstar.androidmvpdemo.api.FlowerApi;
import com.werockstar.androidmvpdemo.model.FlowersCollection;
import com.werockstar.androidmvpdemo.presenter.FlowerPresenter;
import com.werockstar.androidmvpdemo.util.Constant;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FlowerActivity extends AppCompatActivity implements FlowerPresenter.View {

    private RecyclerView recyclerView;
    private FlowerAdapter adapter;

    private Retrofit retrofit;
    private FlowerApi api;

    private FlowerPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        adapter = new FlowerAdapter();
        configurationRetrofit();
        configurationRecycler();

        presenter = new FlowerPresenter(api, this);

        presenter.getFlowerList();
    }

    private void configurationRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(FlowerApi.class);
    }

    private void configurationRecycler() {
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDisplayFlower(List<FlowersCollection> flowers) {
        adapter.setFlowerList(flowers);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onGetFlowerError(String message) {

    }
}
