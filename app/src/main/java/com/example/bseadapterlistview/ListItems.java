package com.example.bseadapterlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListItems extends BaseAdapter {
    private Context context;
    private String[] data;
    LayoutInflater inflater;

    ListItems(Context context, String[] data){
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
        convertView = LayoutInflater.from(context).
                inflate(R.layout.list_item_one, parent, false);
        }else {
            holder =(ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    static class ViewHolder{
        TextView textView;
    }
}
