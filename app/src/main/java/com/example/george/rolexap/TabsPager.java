package com.example.george.rolexap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by george on 11/2/2017.
 */

public class TabsPager extends FragmentStatePagerAdapter {
    int noOfTabs;
    public TabsPager(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs=noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Order ord = new Order();
                return ord;
            case 1:
                Quantity q = new Quantity();
                return q;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
