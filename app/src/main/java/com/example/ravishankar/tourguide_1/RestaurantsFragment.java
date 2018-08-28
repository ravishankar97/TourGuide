package com.example.ravishankar.tourguide_1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.restaurants, container, false);
        final ArrayList<Description> restaurant=new ArrayList<Description>();
        restaurant.add(new Description( getString(R.string.PanAsian),getString(R.string.pan_asian),R.drawable.restaurant_1));
        restaurant.add(new Description( getString(R.string.southern_spice),getString(R.string.spice_description),R.drawable.restaurant_2));
        restaurant.add(new Description( getString(R.string.dakshin),getString(R.string.dakshin_description),R.drawable.restaurant_3));
        restaurant.add(new Description(getString(R.string.barbaque),getString(R.string.Barbaque_description),R.drawable.restaurant_4));
        CustomArrayAdapter adapter=new CustomArrayAdapter(getActivity(),restaurant);
        ListView listView=rootView.findViewById(R.id.restaurantView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
