package com.interesting_gif.bzw.giffffffapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27 0027.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    private List<String> list;

    public RecyclerAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_layout,null));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.item_layout_tv_intr.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        TextView item_layout_tv_intr;
        ImageView item_layout_iv_bg;

        public MyHolder(View itemView) {
            super(itemView);
            item_layout_tv_intr = (TextView) itemView.findViewById(R.id.item_layout_tv_intr);
            item_layout_iv_bg = (ImageView) itemView.findViewById(R.id.item_layout_iv_bg);
        }
    }
}
