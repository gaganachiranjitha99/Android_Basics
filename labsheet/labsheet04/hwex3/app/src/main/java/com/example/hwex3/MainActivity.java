package com.example.hwex3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button  gobtn;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gobtn = (Button)findViewById(R.id.btngo);
        display=(TextView) findViewById(R.id.displaytext);

        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, activity2.class);
                startActivityForResult(intent,1);
          }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1 &&  resultCode== RESULT_OK && data != null){

            String cylindercolour = data.getStringExtra("CYLINDERINFO");
            display.setText(cylindercolour);
        }
    }
}