package com.example.lab03ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    TextView name;
    TextView address;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name=(TextView) findViewById(R.id.txtresultname);
        address=(TextView) findViewById(R.id.txtresultaddress);

        Intent information=getIntent();
        Bundle getinfo=information.getExtras();


        String  resname= getinfo.getString("name");
        String resadd=getinfo.getString("address");
        name.setText(resname);
        address.setText(resadd);




    }
}