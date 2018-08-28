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

public class PlacesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places, container, false);
        final ArrayList<Description> place = new ArrayList<Description>();
        place.add(new Description(getString(R.string.napier), getString(R.string.napierbridge), R.drawable.napier_bridge));
        place.add(new Description(getString(R.string.marina), getString(R.string.marina_beach), R.drawable.marina_beach));
        place.add(new Description(getString(R.string.santhome_church1), getString(R.string.santhome), R.drawable.santhome_church));
        place.add(new Description(getString(R.string.fort), getString(R.string.george), R.drawable.st_george_fort));
        place.add(new Description(getString(R.string.mgr), getString(R.string.memorial), R.drawable.mgr_memorial_at_marina_beach));
        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
