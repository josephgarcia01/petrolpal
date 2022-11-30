package com.example.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DataBaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DataBaseAccess instance;
    Cursor c = null;
    Cursor a = null;
    Cursor b = null;
    Cursor z = null;

    private DataBaseAccess(Context context){
        this.openHelper=new DatabaseOpenHelper(context);



    }

    public static DataBaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DataBaseAccess(context);
        }
        return instance;
    }


    public void open(){
        this.db = openHelper.getWritableDatabase();


    }

    public void close(){
        if(db != null){
            this.db.close();
        }
    }


    public String[] ReturnGasPrices(String name){
        // ArrayList<String> newArray= new ArrayList<>();
        String[] gasPrices = new String[25];
        b = db.rawQuery("SELECT gasPrices_price FROM Mcallen WHERE CityID = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( b.moveToNext()){
            String lul = b.getString(0);
            gasPrices[a] = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return gasPrices;

    }

    public String[] ReturnAddress(String name){

        String[] gasAddress = new String[25];
        c = db.rawQuery("SELECT address FROM Mcallen WHERE CityID = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            gasAddress[a] = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return gasAddress;

    }


    public String[] ReturnName(String name){

        String[] gasName = new String[25];
        c = db.rawQuery("SELECT title FROM Mcallen WHERE CityID = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            gasName[a] = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return gasName;

    }


}
