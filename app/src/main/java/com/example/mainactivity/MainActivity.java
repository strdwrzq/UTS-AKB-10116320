package com.example.mainactivity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

// Satria Dwi Rizqi, 10016320, IF7, Kamis 23 Mei 2019

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.profile);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.contact);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.friend);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomPagerAdapter adapter = new CustomPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
