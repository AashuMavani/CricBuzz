package com.example.cricbuzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.cricbuzz.Adapter.Pager_Adapter;
import com.example.cricbuzz.Fragment.Info_Fragment;
import com.example.cricbuzz.Fragment.Live_Fragment;
import com.example.cricbuzz.Fragment.Scorecard_Fragment;
import com.example.cricbuzz.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TabLayout tabs=binding.tabs;
        ViewPager viewPager=binding.viewPager;

        Pager_Adapter adapter=new Pager_Adapter(getSupportFragmentManager());


        adapter.addFragment(new Info_Fragment(),"INFO");
        adapter.addFragment(new Live_Fragment(),"LIVE");
        adapter.addFragment(new Scorecard_Fragment(),"Scorecard");

      viewPager.setAdapter(adapter);

        tabs.setupWithViewPager(viewPager);
    }
}