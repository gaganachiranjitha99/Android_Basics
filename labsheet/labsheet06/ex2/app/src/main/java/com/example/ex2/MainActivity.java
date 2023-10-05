package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFragment(View view){
        //creating the object for fragment
        Fragment fr;

        //displaying first fragment
        //if button 1 is clicked
        if(view == findViewById(R.id.button1)){

            fr=new FragmentOne();
        }else{

            fr=new FragmentTwo();

        }
        FragmentManager fm =getSupportFragmentManager();
        





    }


}