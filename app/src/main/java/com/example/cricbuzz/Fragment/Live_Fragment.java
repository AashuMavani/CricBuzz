package com.example.cricbuzz.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.cricbuzz.Adapter.Live_Adapter;
import com.example.cricbuzz.R;


public class Live_Fragment extends Fragment {

    String []name={"one","two","three","four","five","six","seven","eight","nine","ten"};
    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_live_, container, false);
        listView=view.findViewById(R.id.listview);
        Live_Adapter adapter=new Live_Adapter(Live_Fragment.this,name);
        listView.setAdapter(adapter);
        return view;

    }
}