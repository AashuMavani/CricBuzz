package com.example.cricbuzz.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.cricbuzz.Fragment.Scorecard_Fragment;
import com.example.cricbuzz.R;

public class Scorecard_Adapter extends BaseAdapter {
    Scorecard_Fragment scorecard_fragment;
    int[]img={R.drawable.cherryblossom,R.drawable.hollyhocks,R.drawable.lotus,R.drawable.plumeria,
              R.drawable.orchid,R.drawable.rose,R.drawable.tulip,R.drawable.cherryblossom,R.drawable.hollyhocks,R.drawable.lotus,R.drawable.plumeria,
            R.drawable.orchid,R.drawable.rose,R.drawable.tulip };
    public Scorecard_Adapter(Scorecard_Fragment scorecard_fragment) {
        this.scorecard_fragment=scorecard_fragment;
    }

    @Override
    public int getCount() {
        return img.length;
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
        view= LayoutInflater.from(scorecard_fragment.getContext()).inflate(R.layout.scorecard_gridview_item,parent,false);
        ImageView imageView=view.findViewById(R.id.images);
        imageView.setImageResource(img[position]);
        return view;
    }
}
