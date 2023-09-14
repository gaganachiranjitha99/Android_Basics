package com.example.bundleobject_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private  TextView name,index,depname,faculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        name=(TextView) findViewById(R.id.dispalyname);
        index=(TextView) findViewById(R.id.displayindex);
        depname=(TextView) findViewById(R.id.displaydepname);
        faculty=(TextView) findViewById(R.id.displayfaculty);


        Intent intent =getIntent();

        if(intent !=null){

            String gname=intent.getStringExtra("name");
            String gindex=intent.getStringExtra("index");
            String gdepname=intent.getStringExtra("depname");
            String gfaculty=intent.getStringExtra("faculty");

            name.setText("name is :" +gname);
            index.setText("Index no is:"+gindex);
            depname.setText("department name :"+gdepname);
            faculty.setText("faculty is: "+gfaculty);

        }





    }
}