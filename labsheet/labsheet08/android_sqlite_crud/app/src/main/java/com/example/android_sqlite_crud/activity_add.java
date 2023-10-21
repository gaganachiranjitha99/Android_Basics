package com.example.android_sqlite_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_add extends AppCompatActivity {

    EditText name;
    EditText dep;
    EditText sal;
    Button btnadd;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name=(EditText) findViewById(R.id.txtname);
        dep=(EditText) findViewById(R.id.txtdep);
        sal=(EditText) findViewById(R.id.txtsalary);
        btnadd=(Button) findViewById(R.id.addbtn);
        dbHandler=new DBHandler(this);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String empname=name.getText().toString();
                String empdep=dep.getText().toString();
                String empsal=sal.getText().toString();
                Employee emp= new Employee(empname,empdep,empsal);
                dbHandler.addEmployee(emp);
                Toast.makeText(getApplicationContext(),"Data inserted",Toast.LENGTH_LONG).show();
            }
        });




    }
}