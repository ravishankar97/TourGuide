package com.example.ravishankar.tourguide_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<Description>{
    public CustomArrayAdapter(Context context, ArrayList<Description> resource) {
        super(context,0,resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Description desc=getItem(position);
        TextView picName=listItemView.findViewById(R.id.name);
        assert desc != null;
        picName.setText(desc.getName());
        TextView textView=listItemView.findViewById(R.id.text);
        textView.setText(desc.getDefinition());
        ImageView imageView=listItemView.findViewById(R.id.image);
        imageView.setImageResource(desc.getImageId());
        return listItemView;
    }
}
