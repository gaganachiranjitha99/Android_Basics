package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name,age,city,gender,mobile,email,department;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    name =(EditText) findViewById(R.id.txtname);
    age=(EditText) findViewById(R.id.txtage);
    gender=(EditText) findViewById(R.id.txtgender);
    city=(EditText) findViewById(R.id.txtcity);
    mobile=(EditText) findViewById(R.id.txtphone);
    email=(EditText) findViewById(R.id.txtemail);
    department=(EditText) findViewById(R.id.txtdepartment);
    btnsubmit=(Button) findViewById(R.id.submitbtn);

    btnsubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String ename=name.getText().toString();
            String ename=name.getText().toString();
            String ename=name.getText().toString();
            String ename=name.getText().toString();
            String ename=name.getText().toString();
            String ename=name.getText().toString();
            String ename=name.getText().toString();

        }
    });

    }
}