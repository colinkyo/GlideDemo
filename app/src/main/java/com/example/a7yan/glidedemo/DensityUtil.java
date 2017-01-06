package com.example.a7yan.glidedemo;

import android.content.Context;
import android.icu.text.RelativeDateTimeFormatter;

/**
 * Created by 7Yan on 2017/1/6.
 */

public class DensityUtil {
    public static int dip2px(Context context,float dbValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dbValue * scale + 0.5f);
    }
    public static int px2dip(Context context,float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
