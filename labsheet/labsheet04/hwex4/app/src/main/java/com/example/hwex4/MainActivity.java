package com.example.hwex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView email;
    TextView phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(TextView) findViewById(R.id.txtemail);
        phone=(TextView) findViewById(R.id.txtphone);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();

            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callPhone();
            }
        });



    }
    private void sendEmail(){

        Intent mailintent= new Intent(Intent.ACTION_SENDTO);
        mailintent.setData(Uri.parse("mailto:gaganachiranjithacoc2@gmail.com"));
        startActivity(mailintent);
    }

    private void callPhone(){

        Intent phoneintent=new Intent(Intent.ACTION_DIAL);
        phoneintent.setData(Uri.parse("tel:+94770298538"));
        startActivity(phoneintent);
    }

}