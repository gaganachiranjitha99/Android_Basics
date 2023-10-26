package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView dname=(TextView) findViewById(R.id.displayname);
        TextView dage=(TextView) findViewById(R.id.agedisplay);
        TextView dgender=(TextView) findViewById(R.id.genderdisplay);
        TextView dcity=(TextView) findViewById(R.id.citydisplay);
        TextView dmobile=(TextView) findViewById(R.id.mobiledisplay);
        TextView demail=(TextView) findViewById(R.id.emaildisplay);
        TextView ddepartment=(TextView) findViewById(R.id.departmentdisplay);

        Intent intent=getIntent();

        String name=intent.getStringExtra("name");
        String age=intent.getStringExtra("age");
        String gender=intent.getStringExtra("gender");
        String city=intent.getStringExtra("city");
        String mobile=intent.getStringExtra("mobile");
        String email=intent.getStringExtra("email");
        String department=intent.getStringExtra("department");

        dname.setText("Name: "+name);
        dage.setText("Age: "+age);
        dgender.setText("Gender: "+gender);
        dcity.setText("City: "+city);
        dmobile.setText("mobile: "+mobile);
        demail.setText("email: "+email);
        ddepartment.setText("department: "+department);

    demail.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent emailintent=new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+email));
            startActivity(emailintent);
        }
    });

dmobile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent callintent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel"+mobile));

    }
});

    }
}