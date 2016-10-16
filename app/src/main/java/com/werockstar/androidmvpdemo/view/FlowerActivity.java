package com.werockstar.androidmvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.werockstar.androidmvpdemo.R;
import com.werockstar.androidmvpdemo.adapter.FlowerAdapter;

public class FlowerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FlowerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        adapter = new FlowerAdapter();
        configurationRecycler();
    }

    private void configurationRecycler() {
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(adapter);
    }
}
