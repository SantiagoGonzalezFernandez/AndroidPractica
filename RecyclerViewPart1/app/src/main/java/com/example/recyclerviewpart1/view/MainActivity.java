package com.example.recyclerviewpart1.view;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.recyclerviewpart1.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.MainActivity_TabLayout);
        viewPager = (ViewPager) findViewById(R.id.MainActivity_ViewPager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment Here

        adapter.AddFragment(new CallFragment(),"");
        adapter.AddFragment(new ContactFragment(),"");
        adapter.AddFragment(new FavFragment(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        //Remove Shadow from the action bar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
