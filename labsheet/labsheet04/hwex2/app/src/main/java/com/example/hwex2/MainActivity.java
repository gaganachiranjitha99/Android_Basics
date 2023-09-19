package com.example.hwex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        



    }
}