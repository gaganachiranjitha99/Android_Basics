package com.example.android_sqlite_crud;

import android.content.ContentValues;
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
        String sql="CREATE TABLE employee(id INTEGER PRIMARY KEY AUTOINCREMENT,TEXT,dep TEXT,salary TEXT);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String sql="DROP TABLE IF EXISTS employee_details;";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);

    }

    public void addEmployee(Employee employee){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",employee.getName());
        contentValues.put("dep",employee.getDep());
        contentValues.put("salary",employee.getSalary());
        sqLiteDatabase.insert("employee",null,contentValues);
        sqLiteDatabase.close();
    }
}
