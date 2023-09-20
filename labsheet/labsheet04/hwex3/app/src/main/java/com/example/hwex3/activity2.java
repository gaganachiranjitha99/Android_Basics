package com.example.hwex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class activity2 extends AppCompatActivity {

    EditText txtcolour;
    Button searchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtcolour=(EditText) findViewById(R.id.txtcolourcode);
        



    }
}