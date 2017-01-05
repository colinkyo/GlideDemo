package com.example.a7yan.glidedemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a7yan.glidedemo.activity.GlideBaseActivity;
import com.example.a7yan.glidedemo.activity.GlideRecyclerViewActivity;
import com.example.a7yan.glidedemo.activity.GlideTranfromationsActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent=null;
        switch (view.getId()){
            case R.id.btn_glide_base:
                intent = new Intent(MainActivity.this,GlideBaseActivity.class);
                break;
            case R.id.btn_glide_rec:
                intent = new Intent(MainActivity.this,GlideRecyclerViewActivity.class);
                break;
            case R.id.btn_glide_tran:
                intent = new Intent(MainActivity.this,GlideTranfromationsActivity.class);
                break;
        }
        startActivity(intent);
    }
}
