package com.example.a7yan.glidedemo.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a7yan.glidedemo.R;
import com.example.a7yan.glidedemo.adapter.GlideRecyclerViewAdapter;

public class GlideRecyclerViewActivity extends Activity
{
    private RecyclerView recyclerView;
    private GlideRecyclerViewAdapter glideRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recycler_view);
        recyclerView = (RecyclerView) findViewById(R.id.rv_glide);
        glideRecyclerViewAdapter = new GlideRecyclerViewAdapter(this);
        recyclerView.setAdapter(glideRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }
}
