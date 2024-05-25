package com.example.cricbuzz.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cricbuzz.Fragment.Live_Fragment;
import com.example.cricbuzz.R;

public class Live_Adapter extends BaseAdapter {
    Live_Fragment live_fragment;
    String[] name;
    public Live_Adapter(Live_Fragment live_fragment, String[] name) {
        this.live_fragment=live_fragment;
        this.name=name;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(live_fragment.getContext()).inflate(R.layout.live_listview_item,parent,false);
        TextView textView=view.findViewById(R.id.text);
        textView.setText(name[position]);

        return view;
    }
}
