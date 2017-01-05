package com.example.a7yan.glidedemo.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.example.a7yan.glidedemo.R;

import java.io.File;

public class GlideBaseActivity extends Activity {
    TextView tv_glide_1,tv_glide_2,tv_glide_3,tv_glide_4,tv_glide_5,tv_glide_6,tv_glide_7,tv_glide_8,tv_glide_9;
    ImageView iv_glide_1,iv_glide_2,iv_glide_3,iv_glide_4,iv_glide_5,iv_glide_6,iv_glide_7,iv_glide_8,iv_glide_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_base);

        tv_glide_1 = (TextView) findViewById(R.id.tv_glide_1);
        tv_glide_2 = (TextView) findViewById(R.id.tv_glide_2);
        tv_glide_3 = (TextView) findViewById(R.id.tv_glide_3);
        tv_glide_4 = (TextView) findViewById(R.id.tv_glide_4);
        tv_glide_5= (TextView) findViewById(R.id.tv_glide_5);
        tv_glide_6 = (TextView) findViewById(R.id.tv_glide_6);
        tv_glide_7 = (TextView) findViewById(R.id.tv_glide_7);
        tv_glide_8 = (TextView) findViewById(R.id.tv_glide_8);
        tv_glide_9 = (TextView) findViewById(R.id.tv_glide_9);

        iv_glide_1=(ImageView) findViewById(R.id.iv_glide_1);
        iv_glide_2 = (ImageView) findViewById(R.id.iv_glide_2);
        iv_glide_3 = (ImageView) findViewById(R.id.iv_glide_3);
        iv_glide_4 = (ImageView) findViewById(R.id.iv_glide_4);
        iv_glide_5 = (ImageView) findViewById(R.id.iv_glide_5);
        iv_glide_6 = (ImageView) findViewById(R.id.iv_glide_6);
        iv_glide_7 = (ImageView) findViewById(R.id.iv_glide_7);
        iv_glide_8 = (ImageView) findViewById(R.id.iv_glide_8);
        iv_glide_9 = (ImageView) findViewById(R.id.iv_glide_9);
        //开始使用
        tv_glide_1.setText("1：加载网络图片");
        Glide.with(this).load("http://img4.imgtn.bdimg.com/it/u=1248498166,696774072&fm=23&gp=0.jpg").into(iv_glide_1);

        tv_glide_2.setText("2：加载资源图片");
        Glide.with(this).load(R.mipmap.ic_launcher).into(iv_glide_2);

        tv_glide_3.setText("3：加载本地图片");
        String path = Environment.getExternalStorageDirectory()+"/t1.jpg";
        File file = new File(path);
        Uri uri = Uri.fromFile(file);
        Log.e("7yan",path);
        Glide.with(this).load(uri).into(iv_glide_3);

        tv_glide_4.setText("4：加载资源Gif图片");
        Glide.with(this).load("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=449066035,4156563186&fm=116&gp=0.jpg").placeholder(R.mipmap.ic_launcher).into(iv_glide_4);

        tv_glide_5.setText("5：加载资源Gif图片");
        Glide.with(this).load(R.mipmap.load).asGif().placeholder(R.mipmap.ic_launcher).into(iv_glide_5);

        tv_glide_6.setText("6：加载本地Gif图片");
        String gifpath = Environment.getExternalStorageDirectory()+"/Loading.gif";
        File giffile = new File(gifpath);
        Glide.with(this).load(giffile).placeholder(R.mipmap.ic_launcher).into(iv_glide_6);

        tv_glide_7.setText("7：加载本地小视频和快照");
        String mp4path = Environment.getExternalStorageDirectory()+"/xyj.mp4";
        Log.e("7yan",mp4path);
        File mp4file = new File(mp4path);
        Glide.with(this).load(Uri.fromFile(mp4file)).placeholder(R.mipmap.ic_launcher).into(iv_glide_7);

        tv_glide_8.setText("8：加载缩略图，再加载原图");
        String urlpath = Environment.getExternalStorageDirectory()+"/t1.jpg";
        Log.e("7yan",mp4path);
        File urlfile = new File(urlpath);
        Glide.with(this).load(Uri.fromFile(urlfile)).thumbnail(0.1f).centerCrop().placeholder(R.mipmap.ic_launcher).into(iv_glide_8);

        tv_glide_9.setText("9：先创建缩略图，然后加载缩略图，再加载原图");
        DrawableRequestBuilder requestBuilder= Glide.with(this).load(new File(urlpath));
        Glide.with(this).load(Uri.fromFile(mp4file)).thumbnail(requestBuilder).centerCrop().placeholder(R.mipmap.ic_launcher).into(iv_glide_9);
    }
}
