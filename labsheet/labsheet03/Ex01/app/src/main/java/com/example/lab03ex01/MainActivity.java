package com.example.lab03ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    EditText name;
    EditText address;
    Button subbtn;
    Bundle bundle;
    Intent check;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=(EditText) findViewById(R.id.txtname);
        address=(EditText) findViewById(R.id.txtaddress);
        subbtn=(Button) findViewById(R.id.submitbtn);

        check=new Intent(this, Activity2.class);
        bundle=new Bundle();

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name",name.getText().toString());
                bundle.putString("address",address.getText().toString());
                check.putExtras(bundle);
                startActivity(check);


            }
        });

    }
}