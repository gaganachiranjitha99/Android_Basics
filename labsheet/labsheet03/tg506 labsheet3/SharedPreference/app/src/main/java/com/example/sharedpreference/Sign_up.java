package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {

    EditText name,city,username,password;
    Button backbtn,signupbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        name=(EditText) findViewById(R.id.txtupname);
        city=(EditText) findViewById(R.id.txtupcity);
        username=(EditText) findViewById(R.id.txtupusername);
        password=(EditText) findViewById(R.id.txtuppassword);
        backbtn=(Button) findViewById(R.id.btnback);
        signupbtn=(Button) findViewById(R.id.btnsignup);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SharedPreferences data1=getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor editor=data1.edit();
                editor.putString("NAME",name.getText().toString());
                editor.putString("CITY",city.getText().toString());
                editor.putString("USERNAME",username.getText().toString());
                editor.putString("PASSWORD",password.getText().toString());

                editor.commit();
                Toast.makeText(Sign_up.this,"DATA SAVED",Toast.LENGTH_LONG).show();

                Intent intent =new Intent(Sign_up.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Sign_up.this, MainActivity.class);
                startActivity(intent);

                finish();


            }
        });





    }
}