package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity {

    EditText username,password;
    Button signin;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username=(EditText) findViewById(R.id.txtinusername);
        password=(EditText) findViewById(R.id.txtinpassword);
        signin=(Button) findViewById(R.id.btnsignin);


        SharedPreferences data2=getSharedPreferences("details",MODE_PRIVATE);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String eusername=username.getText().toString();
                String epassword=password.getText().toString();

                String susername=data2.getString("USERNAME","");
                String spassword=data2.getString("PASSWORD","");

                if(eusername.equals(susername)&&epassword.equals(spassword)){

                    Intent intent =new Intent(Sign_in.this, last.class);
                    startActivity(intent);
                    finish();
                }else{

                    Toast.makeText(Sign_in.this,"Signup error",Toast.LENGTH_LONG).show();


                }


            }
        });


    }
}