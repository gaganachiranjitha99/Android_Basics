package com.example.hwex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {



     EditText et1,et2,et3,et4,et5;
     Button calculatebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        et1=(EditText) findViewById(R.id.txtitem1);
        et2=(EditText) findViewById(R.id.txtitem2);
        et3=(EditText) findViewById(R.id.txtitem3);
        et4=(EditText) findViewById(R.id.txtitem4);
        et5=(EditText) findViewById(R.id.txtitem5);

        calculatebtn=(Button) findViewById(R.id.btncalculate);

        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double total=calculateItem();

            }
        });

    }
    private double calculateItem(){

        double total=0.0;
        total += parseDouble(et1.getText().toString());
        total += parseDouble(et2.getText().toString());
        total += parseDouble(et3.getText().toString());
        total += parseDouble(et4.getText().toString());

        return total;
    }

    private double parseDouble(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }


}