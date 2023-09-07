package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText name;
    EditText city;

    Button btnread;
    Button btnwrite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.txtname);
        city=(EditText) findViewById(R.id.txttown);
        btnread=(Button) findViewById(R.id.readbtn);
        btnwrite=(Button) findViewById(R.id.writebtn);

        btnwrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences data1=getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor editor =data1.edit();
                editor.putString("Name",name.getText().toString());
                editor.putString("Town",city.getText().toString());
                editor.commit();
                Toast.makeText(getApplicationContext(), "Data stored", Toast.LENGTH_SHORT).show();

            }
        });

        btnread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences data2=getSharedPreferences("details",MODE_PRIVATE);
                String name=data2.getString("name","name not stored");
                String city=data2.getString("Town","town not stored");
                Toast.makeText(getApplicationContext(), "Your name: "+name+"city: "+city, Toast.LENGTH_SHORT).show();

            }
        });




    }
}