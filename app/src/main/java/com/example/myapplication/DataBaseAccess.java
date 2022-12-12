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
        b = db.rawQuery("SELECT regular_price FROM RGV WHERE CityID = '"+name+"'", new String[]{});
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
        c = db.rawQuery("SELECT address FROM RGV WHERE CityID = '"+name+"'", new String[]{});
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
        c = db.rawQuery("SELECT title FROM RGV WHERE CityID = '"+name+"'", new String[]{});
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

    public String[] ReturnTotalScore(String name){

        String[] GasTotalScore = new String[25];
        c = db.rawQuery("SELECT totalScore FROM RGV WHERE CityID = '"+name+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            GasTotalScore[a] = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return GasTotalScore;

    }

    public String[] Return_id(String name){

        String[] GasID = new String[25];
        c = db.rawQuery("SELECT ID_getter FROM RGV WHERE CityID = '"+name+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            GasID[a] = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return GasID;

    }







    // Display_full_gas information
    public String Return_D_address(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT address FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }

    public String Return_D_title(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT title FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }



    public String Return_D_url(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT url FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }

    public String Return_D_regular_price(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT regular_price FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }

    public String Return_D_phonenumber(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT phone FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }

    public String Return_D_mid_price(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT midgrade_price FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }


    public String Return_D_prem_price(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT premium_price FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }

    public String Return_D_diesel_price(String id_position){

        String ID_city = " ";
        c = db.rawQuery("SELECT diesel_price FROM RGV WHERE ID_getter = '"+id_position+"'" , new String[]{});
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        while( c.moveToNext()){
            String lul = c.getString(0);
            ID_city = lul;
            buffer.append(" "+ lul + "  ");
            a++;

        }
        return ID_city;

    }


}
