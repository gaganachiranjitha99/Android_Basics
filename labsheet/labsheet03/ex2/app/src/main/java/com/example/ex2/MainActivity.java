package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    private static final String MAIN_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text){

        Log.d(MAIN_ACTIVITY_TAG,text);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("Activity created");
    }







    protected void oncreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        showLog("Activity Created");

    }

    protected void OnRestart(){
        super.onRestart();
        showLog("Activity Restarted");
    }

    protected void onStart(){
        super.onStart();
        showLog("Activity started");
    }

    protected void onResume(){
        super.onResume();
        showLog("Activity Resumed");
    }

}