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

public class EventsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.events, container, false);
        final ArrayList<Description>event=new ArrayList<>();
        event.add(new Description(getString(R.string.kerala_stand_up),getString(R.string.kerala_standup),R.drawable.event1));
        event.add(new Description(getString(R.string.Python_workshop),getString(R.string.python),R.drawable.events2));
        event.add(new Description(getString(R.string.robotics_workshop),getString(R.string.robotics),R.drawable.event3));
        event.add(new Description(getString(R.string.QuadCopter),getString(R.string.quadcopter),R.drawable.event4));
        CustomArrayAdapter adapter=new CustomArrayAdapter(getActivity(),event);
        ListView listView=rootView.findViewById(R.id.eventsView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
