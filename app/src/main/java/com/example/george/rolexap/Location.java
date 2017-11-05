package com.example.george.rolexap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by george on 11/2/2017.
 */

public class Location extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.location,container,false);
        String [] location = {"Taso Village","kashanyaraze","tank Hill","Campus"};
        Spinner spinner =(Spinner)view.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_dropdown_item,location);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        return view;
    }
}
