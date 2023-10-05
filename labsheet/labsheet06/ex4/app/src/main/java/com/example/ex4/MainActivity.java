package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    TextView textView;
    String[] carBrands={

            "Ferrari",
            "Mclaren",
            "Jaguar",
            "Skoda",
            "Susuki",
            "Hyhndai",
            "Mercedes",
            "Bmw",
            "Ford",
            "Honda",
            "Chevrolet",
            "Volkwagon",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView) findViewById(R.id.grid);
        textView=(TextView) findViewById(R.id.textview);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.id.textview,carBrands);
        gridView.setAdapter(adapter);

    }
}