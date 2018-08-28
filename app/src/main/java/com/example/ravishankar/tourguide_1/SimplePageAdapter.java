package com.example.ravishankar.tourguide_1;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SimplePageAdapter extends FragmentStatePagerAdapter {
    private String tabTitles[] = new String[]{String.valueOf(R.string.events), String.valueOf(R.string.historical_places), String.valueOf(R.string.restaurants)};

    SimplePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new PlacesFragment();
        } else {
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public String getPageTitle(int position) {
        return (String.valueOf(tabTitles[position]));
    }
}



