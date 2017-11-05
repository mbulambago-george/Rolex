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

public class Quantity extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.quantity,container,false);
        String [] quantity = {"2 Egss & 1 Chapati","2 Eggs & 2 Chappati","1 Egg & 1 Chappati","1 Egg & 2 Chappati","other specify"};
        Spinner spinner =(Spinner)view.findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_dropdown_item,quantity);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        return view;
    }
}
