package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText fname,lname;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname =(EditText)findViewById(R.id.txtfname);
        lname=(EditText) findViewById(R.id.txtlname);
        show=(Button) findViewById(R.id.btnshow);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String efname=fname.getText().toString();
                String elname=lname.getText().toString();
                String fullname=efname +" "+ elname;

                Toast.makeText(MainActivity.this,"Full name: " +fullname,Toast.LENGTH_LONG).show();





            }
        });





    }
}