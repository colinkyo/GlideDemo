package com.example.a7yan.glidedemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a7yan.glidedemo.R;

/**
 * Created by 7Yan on 2017/1/6.
 */

public class GlideRecyclerViewAdapter<V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<GlideRecyclerViewAdapter.ViewHolder>{
    private Context mContext;
    public static final String[] mDatas=new String[]{
            "http://b.hiphotos.baidu.com/image/h%3D200/sign=80043cea9e82d158a4825eb1b00a19d5/aa18972bd40735fab7c0f4bd9c510fb30f240885.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3740249150,339319482&fm=11&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=4045835508,2152493659&fm=11&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2647026928,1164126939&fm=11&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3600653605,1581323511&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2792225718,210514250&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=517294741,1448007038&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3388635838,3622054166&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=2158092625,538133972&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=3113254585,1040028060&fm=11&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=408487492,1470914284&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=2941846617,481464810&fm=11&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=397355611,2315128216&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1504419353,2779925580&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2269150364,1482663370&fm=21&gp=0.jpg"
    };
    public GlideRecyclerViewAdapter(Context context)
    {
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        ViewHolder viewHolder;
        View itemview = View.inflate(mContext, R.layout.item_glide_recyclerview,null);
        viewHolder = new ViewHolder(itemview);
        viewHolder.iv_glide_rv = (ImageView) itemview.findViewById(R.id.iv_glide_recyclerview);
        //不能设置setTag
        //itemview.setTag(viewHolder);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,mContext.getResources().getDisplayMetrics());
        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200f,mContext.getResources().getDisplayMetrics());
        Glide.with(mContext)
                .load(mDatas[position])
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .override(width,height)
                .centerCrop()
                .fitCenter()
                .animate(R.anim.glide_anim)
                .into(holder.iv_glide_rv);
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0:mDatas.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_glide_rv;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
