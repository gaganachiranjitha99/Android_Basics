package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    click=(Button) findViewById(R.id.clickbtn);


    }

    public void showMsg(View view) {

        Toast msg=Toast.makeText(this,"the button was clicked",Toast.LENGTH_LONG);
        msg.show();
    }
}