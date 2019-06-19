package com.example.applepi_;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;

public class ListAdapter extends BaseAdapter {


    ArrayList<Data> items;


//    alt+insert !!!!!!!!!! constructor 와 getter setter
    public ListAdapter(ArrayList<Data> item) {
        this.items = item;
    }

    public ListAdapter() {
    }

    @Override
    public int getCount() {

        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem,null);

        TextView title = v.findViewById(R.id.listitem_title);

        Data data = items.get(position);
        String str_title = data.getTitle();

        title.setText(str_title);



        return v;
    }
}
