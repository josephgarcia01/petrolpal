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

    /*
    public String getAddress(String name){
        c = db.rawQuery("SELECT address from Edinburg_test where title = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while( c.moveToNext()){
            String address = c.getString(0);
            buffer.append(" "+ address + "  ");

        }
        return buffer.toString();
    }

    public String getGastype(String name) {
        a = db.rawQuery("SELECT Gas_type_0 from Edinburg_test where title = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while( a.moveToNext()){
            String gastype = a.getString(0);
            buffer.append(" "+ gastype + "  ");

        }
        return buffer.toString();



    }

    public String getGasprice(String name) {
        b = db.rawQuery("SELECT Gas_price_0 from Edinburg_test where title = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while( b.moveToNext()){
            String gasprice = b.getString(0);
            buffer.append(" "+ gasprice + "  ");

        }
        return buffer.toString();



    }
   */
    public String Changetable(String name){
       // ArrayList<String> newArray= new ArrayList<>();

        b = db.rawQuery("SELECT Gas_price_0 from'"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while( b.moveToNext()){
            String lul = b.getString(0);
            buffer.append(" "+ lul + "  ");

        }
        return buffer.toString();

    }





}
