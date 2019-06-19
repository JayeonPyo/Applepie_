package com.example.applepi_;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {


    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView listView;
    View v;
    public Fragment1() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         v = LayoutInflater.from(getContext()).inflate(R.layout.fragment1,null);
//        메모리에 불려옴 컨트롤 o


        listView = v. findViewById(R.id.listview);

        mAdapter = new ListAdapter(items);
        listView.setAdapter(mAdapter);




        items.add(new Data("a", "a1"));
        items.add(new Data("a", "a2"));
        items.add(new Data("a", "a3"));
        items.add(new Data("a", "a4"));
        mAdapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(v.getContext(),Detail.class);


                intent.putExtra("title",items.get(position).getTitle());
                intent.putExtra("content",items.get(position).getContent());


                startActivity(intent);
            }
        });

        mAdapter.notifyDataSetChanged();

        return v;
    }
}
