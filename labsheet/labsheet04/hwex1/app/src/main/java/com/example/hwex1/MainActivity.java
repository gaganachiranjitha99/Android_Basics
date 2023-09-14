package com.example.hwex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button gobtn;
    private EditText urltxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gobtn=(Button) findViewById(R.id.btngo);
        urltxt=(EditText) findViewById(R.id.txturl);

        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredUrl=urltxt.getText().toString().trim();

                Uri webpage =Uri.parse(enteredUrl);
                Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(Intent.makeMainActivity());



            }
        });



    }
}