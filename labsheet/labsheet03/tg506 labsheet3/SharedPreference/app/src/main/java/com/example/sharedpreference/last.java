package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class last extends AppCompatActivity {
        TextView jname,jcity;
        SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        jname=(TextView) findViewById(R.id.txtlastname);
        jcity= (TextView) findViewById(R.id.txtlastcity);

        sharedPreferences = getSharedPreferences("details", MODE_PRIVATE);

        String sname = sharedPreferences.getString("NAME", "");
        String scity = sharedPreferences.getString("CITY", "");

        jname.setText("Name: " + jname);
        jcity.setText("City: " + jcity);




    }
}