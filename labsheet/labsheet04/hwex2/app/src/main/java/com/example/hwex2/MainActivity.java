package com.example.hwex2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayTotal;
    Button gobtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTotal=(TextView) findViewById(R.id.totalTextView);
        gobtn=(Button) findViewById(R.id.btncart);

        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,secondActivity.class);
                startActivityForResult(intent,1);




            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1){

            double fulltotal= data.getDoubleExtra("TOTAL",0.0);
            displayTotal.setText((int) fulltotal);
        }


    }
}