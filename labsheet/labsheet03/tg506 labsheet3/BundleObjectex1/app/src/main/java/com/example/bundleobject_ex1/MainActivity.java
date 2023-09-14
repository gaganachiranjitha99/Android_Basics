package com.example.bundleobject_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username,password;
    Button login;

    private static  final  String REQ_USERNAME="user";
    private static  final  String REQ_PASSWORD="root";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    username=(EditText) findViewById(R.id.txtusername);
    password=(EditText) findViewById(R.id.txtpassword);
    login=(Button) findViewById(R.id.btnLogin);


    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String enteredUser =username.getText().toString();
            String enteredpass=password.getText().toString();

            if(enteredUser.equals(REQ_USERNAME) && enteredpass.equals(REQ_PASSWORD)){

                Intent intent =new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);

            }else{

                Toast.makeText(MainActivity.this,"Invalid Credintials",Toast.LENGTH_SHORT).show();
            }



        }
    });





    }


}