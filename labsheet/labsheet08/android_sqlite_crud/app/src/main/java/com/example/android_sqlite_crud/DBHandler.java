package com.example.android_sqlite_crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String databaseName="employee_details";
    private static final int ver=1;

    public DBHandler(Context context){
        super (context,databaseName,null,ver);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
