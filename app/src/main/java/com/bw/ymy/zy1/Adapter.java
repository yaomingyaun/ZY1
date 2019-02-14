package com.bw.ymy.zy1;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.bw.ymy.zy1.bean.Home;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Home.ResultBean> mdata;
    private Context context;

    public Adapter(Context context) {
        this.context = context;
        mdata=new ArrayList<>();
    }
    public  void  setlist(List<Home.ResultBean> datas)
    {
        mdata=datas;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.item1,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.title.setText(mdata.get(i).getCommodityName());
        Uri uri=Uri.parse(mdata.get(i).getMasterPic());
        viewHolder.icon.setImageURI(uri);


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    class  ViewHolder extends  RecyclerView.ViewHolder{
        TextView title;
        SimpleDraweeView icon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            icon=itemView.findViewById(R.id.icon);
        }
    }
}
