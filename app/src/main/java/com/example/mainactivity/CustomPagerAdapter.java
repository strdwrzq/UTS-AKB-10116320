package com.example.mainactivity;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Satria Dwi Rizqi, 10016320, IF7, Kamis 23 Mei 2019
public class CustomPagerAdapter extends PagerAdapter {

    public Object instantiateItem(View collection, int position) {
        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        int resid = 0;
        switch(position) {
            case 0 :
                resid = R.layout.halaman1;
                break;
            case 1 :
                resid = R.layout.halaman2;
                break;
            case 2 :
                resid = R.layout.halaman3;
                break;
            case 3 :
                resid = R.layout.halaman4;
                break;
        }

        View view = inflater.inflate(resid, null);
        ((ViewPager)collection).addView(view, 0);
        return view;
    }


    @Override
    public void destroyItem(ViewGroup arg0, int arg1, Object arg2) {
        ((ViewPager)arg0).removeView((View)arg2);
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return arg0 == ((View)arg1);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 4;
    }


}