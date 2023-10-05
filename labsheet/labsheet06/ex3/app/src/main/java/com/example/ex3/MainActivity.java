package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView MonthList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] List={"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec",
                "jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};

        ArrayAdapter Months=new ArrayAdapter<String>(this,R.layout.list_row,R.id.months,List);
        MonthList=(ListView) findViewById(R.id.listMonths);
        MonthList.setAdapter(Months);
    }
}