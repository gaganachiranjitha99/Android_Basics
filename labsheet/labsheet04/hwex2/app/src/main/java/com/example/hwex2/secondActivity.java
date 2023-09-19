package com.example.hwex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {



    private EditText et1,et2,et3,et4,et5;
    private Button calculatebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        et1=(EditText) findViewById(R.id.txtitem1);
        et2=(EditText) findViewById(R.id.txtitem2);
        et3=(EditText) findViewById(R.id.txtitem3);
        et4=(EditText) findViewById(R.id.txtitem4);
        et5=(EditText) findViewById(R.id.txtitem5);

        


    }
}