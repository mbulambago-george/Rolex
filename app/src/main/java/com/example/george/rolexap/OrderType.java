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

public class OrderType extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ordertype,container,false);
        String [] type= {"Rolex","Pizza","Plain Chappati","Kikomando","Plain Eggs"};
        Spinner spinner =(Spinner)view.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_dropdown_item,type);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        return view;
    }
}
