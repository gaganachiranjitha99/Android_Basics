package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements Adapter, AdapterView.OnItemSelectedListener {

    String animalsList[]={"Lion","Tiger","Monkey","Elephant","Dog","Cat","Camal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin=(Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter animals=new ArrayAdapter(this, android.R.layout.simple_spinner_item,animalsList);
        animals.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(animals);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}