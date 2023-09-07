package com.example.bundleobject_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    TextView name,indexno,depname,faculty;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    name=(TextView) findViewById(R.id.txtname2);
    





    }
}