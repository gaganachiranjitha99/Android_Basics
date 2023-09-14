package com.example.ex2;

import static com.example.ex2.MainActivity.My_REQUEST_CODE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class two extends AppCompatActivity {


    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        edit=(EditText) findViewById(R.id.txta2);
        btn=(Button) findViewById(R.id.btna2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg=edit.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",msg);
                setResult(My_REQUEST_CODE,intent);
                finish();


            }
        });


    }
}