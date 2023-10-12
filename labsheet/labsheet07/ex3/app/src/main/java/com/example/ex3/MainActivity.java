package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ListView simpleListview;
    String[] animalName={"Rabbit","Squirrel","Dog","Tiger","Elephant","Deer"};


    int[] animalName={R.drawable.animal1,R.drawable.animal2,
    R.drawable.animal3,R.drawable.animal4,
            R.drawable.animal5,R.drawable.animal6
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListview =(ListView) findViewById(R.id.simpleListView);
        ArrayList<HashMap<String,String>> arrayList=new HashMap<>();
        for (int i=0;i<animalName.length;i++){
            HashMap<String,String> hashMap =new HashMap<>();
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i]+"");

            arrayList.add(hashMap);
        }
    }
}