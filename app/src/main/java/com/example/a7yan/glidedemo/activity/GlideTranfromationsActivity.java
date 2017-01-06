package com.example.a7yan.glidedemo.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a7yan.glidedemo.R;
import com.example.a7yan.glidedemo.adapter.GlideTranfromationsAdapter;

public class GlideTranfromationsActivity extends Activity {
    private RecyclerView rc;
    private GlideTranfromationsAdapter glideTranfromationsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_tranfromations);
        rc=(RecyclerView) findViewById(R.id.rc_glide_tranfromations);

        glideTranfromationsAdapter = new GlideTranfromationsAdapter(this);

        rc.setAdapter(glideTranfromationsAdapter);
        rc.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
