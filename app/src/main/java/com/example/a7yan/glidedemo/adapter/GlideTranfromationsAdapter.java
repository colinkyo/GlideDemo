package com.example.a7yan.glidedemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.support.annotation.IntegerRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.a7yan.glidedemo.DensityUtil;
import com.example.a7yan.glidedemo.R;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.CropSquareTransformation;
import jp.wasabeef.glide.transformations.CropTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import jp.wasabeef.glide.transformations.MaskTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.PixelationFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation;

/**
 * Created by 7Yan on 2017/1/6.
 */

public class GlideTranfromationsAdapter extends RecyclerView.Adapter<GlideTranfromationsAdapter.ViewHolder>
{
    private  List<String> mData = new ArrayList<>();
    private Context mContext;
    private int integer;

    public GlideTranfromationsAdapter(Context context)
    {
        mContext = context;
        for (int i=1;i<=21;i++){
            mData.add(i+"");
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        ViewHolder viewHolder;
        View itemview = View.inflate(mContext,R.layout.item_glide_tranfromations,null);
        viewHolder = new ViewHolder(itemview);
        viewHolder.iv_glide_tfm = (ImageView) itemview.findViewById(R.id.iv_glide_tranfromations);
        viewHolder.tv_glide_tfm = (TextView) itemview.findViewById(R.id.tv_glide_tranfromations);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        integer =Integer.parseInt(mData.get(position));
        holder.tv_glide_tfm.setText("item"+mData.get(position));
        switch (integer){
            case 1:{
                int width = DensityUtil.dip2px(mContext,133.33f);
                int height= DensityUtil.dip2px(mContext,126.33f);
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .override(width,height)
                        .bitmapTransform(new CenterCrop(mContext),
                                new MaskTransformation(mContext,R.mipmap.load))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 2:{
                int width = DensityUtil.dip2px(mContext,150.0f);
                int height= DensityUtil.dip2px(mContext,100.0f);
                Glide.with(mContext).
                        load(R.mipmap.check)
                        .override(width,height)
                        .bitmapTransform(new CenterCrop(mContext),
                                new MaskTransformation(mContext,R.mipmap.ic_launcher))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 3:{
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new CropTransformation(mContext,300,100,CropTransformation.CropType.TOP))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 4:{
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new CropTransformation(mContext,300,100))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 5:{
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new CropTransformation(mContext,300,100, CropTransformation.CropType.BOTTOM))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 6:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new CropSquareTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 7:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new CropCircleTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 8:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new ColorFilterTransformation(mContext,Color.argb(80,255,0,0)))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 9:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new GrayscaleTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 10:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new RoundedCornersTransformation(mContext,30,0, RoundedCornersTransformation.CornerType.BOTTOM))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 11:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new BlurTransformation(mContext,25))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 12:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new ToonFilterTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 13:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new SepiaFilterTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 14:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new ContrastFilterTransformation(mContext,2.0f))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 15:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new InvertFilterTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 16:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new PixelationFilterTransformation(mContext,20))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 17:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new SketchFilterTransformation(mContext))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 18:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new SwirlFilterTransformation(mContext,0.5f,1.0f,new PointF(0.5f,0.5f)))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 19:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new BrightnessFilterTransformation(mContext,0.5f))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 20:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new KuwaharaFilterTransformation(mContext,25))
                        .into(holder.iv_glide_tfm);
                break;
            }
            case 21:
            {
                Glide.with(mContext)
                        .load(R.mipmap.check)
                        .bitmapTransform(new VignetteFilterTransformation(mContext,new PointF(0.5f,0.5f),new float[]{0.0f,0.0f,0.0f},0f,0.75f))
                        .into(holder.iv_glide_tfm);
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_glide_tfm;
        private TextView tv_glide_tfm;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}