package com.example.cricbuzz.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.cricbuzz.R;
import com.example.cricbuzz.Adapter.Scorecard_Adapter;


public class Scorecard_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_scorecard_, container, false);
        GridView gridView=view.findViewById(R.id.gridview);
        Scorecard_Adapter adapter=new Scorecard_Adapter(Scorecard_Fragment.this);
        gridView.setAdapter(adapter);
        return view;
    }
}