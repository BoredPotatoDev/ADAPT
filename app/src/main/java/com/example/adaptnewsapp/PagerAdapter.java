package com.example.adaptnewsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new HomeFragment();

            case 1:
                return new TechnologyFragment();

            case 2:
                return new SportsFragment();

            case 3:
                return new ShowbizFragment();

            case 4:
                return new InternationalFragment();

            case 5:
                return new BusinessFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
