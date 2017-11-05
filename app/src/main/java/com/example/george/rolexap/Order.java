package com.example.george.rolexap;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by george on 11/2/2017.
 */

public class Order extends Fragment {
    DatabaseReference mydb,rol;
    Button btn;
    TextInputLayout ed1,ed2;
    Spinner s1,s2,s3;

private EditText ed3;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
View v=inflater.inflate(R.layout.order,container,false);



        ed1= v.findViewById(R.id.contact);
        ed2= v.findViewById(R.id.name);
        ed3= v.findViewById(R.id.editamo);

        s1= v.findViewById(R.id.spinner);
        s2=(Spinner)v.findViewById(R.id.spinner2);
        s3=(Spinner)v.findViewById(R.id.spinner3);


        btn=(Button)v.findViewById(R.id.sub);
        mydb = FirebaseDatabase.getInstance().getReference();
        rol=mydb.child("Rolex");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = ed1.getEditText().getText().toString();
                String val2 = ed2.getEditText().getText().toString();
                String val3 = ed3.getText().toString();

                String val4=s1.getSelectedItem().toString();
                String val5= s2.getSelectedItem().toString();
                String val6 = s3.getSelectedItem().toString();

                Map<String, String> map=new HashMap<String, String>();
                map.put("orderType","Pizza");
                map.put("quantity","3 eggs, 1 chappat");
                map.put("order",val);
                map.put("usercontact",val2);
                btn.setOnClickListener(this);


                rol.push().setValue(map, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                   if (databaseError==null){
                       Toast.makeText(getContext(), "Order saved", Toast.LENGTH_SHORT).show();
                   }
                    }
                });




            }
        });

return v;
    }
}
