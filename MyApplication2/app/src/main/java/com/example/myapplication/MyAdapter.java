package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
 ArrayList<Item> list;
 Context context;
 int layout;
    public MyAdapter(Context context,ArrayList<Item> list,int layout) {
        this.list=list;
        this.context=context;
        this.layout=layout;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Item getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.
                getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,parent,false);
        TextView maintv=convertView.findViewById(R.id.item_maintv);
        TextView subtv=convertView.findViewById(R.id.item_subtv);

        maintv.setText(list.get(position).getMainText());
        subtv.setText(list.get(position).getSubText());
        return convertView;
    }
}
