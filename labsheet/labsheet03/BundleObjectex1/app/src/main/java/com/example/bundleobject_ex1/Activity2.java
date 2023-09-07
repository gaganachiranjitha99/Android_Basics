package com.example.bundleobject_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {


    TextView name,indexno,depname,faculty;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    name=(TextView) findViewById(R.id.txtname2);
    indexno=(TextView) findViewById(R.id.txtindex2);
    depname=(TextView) findViewById(R.id.txtdepartment2);
    faculty=(TextView) findViewById(R.id.txtfaculty2);
    submitbtn=(Button) findViewById(R.id.btnsubmit);

    submitbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            String ename= name.getText().toString();
            String eindex=indexno.getText().toString();
            String edepname=depname.getText().toString();
            String efaculty=faculty.getText().toString();

            Intent intent=new Intent(Activity2.this, Activity3.class);
            intent.putExtra("name",ename);
            intent.putExtra("index",eindex);
            intent.putExtra("depname",edepname);
            intent.putExtra("faculty",efaculty);

            startActivity(intent);
        }
    });

    





    }
}