package com.example.ex2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView dispaly;
    Button btn1;

    static final int My_REQUEST_CODE=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dispaly=(TextView) findViewById(R.id.displaya1);
        btn1=(Button) findViewById(R.id.btna1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  i =new Intent(MainActivity.this, two.class);
                        startActivityForResult(i,My_REQUEST_CODE);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==My_REQUEST_CODE){

            String msg=data.getStringExtra("message");
        }

    }
}
