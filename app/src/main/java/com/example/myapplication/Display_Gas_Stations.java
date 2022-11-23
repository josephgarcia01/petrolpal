package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;


public class Display_Gas_Stations extends AppCompatActivity {
    public TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_gas_stations);
        Bundle extras = getIntent().getExtras();
        String sessionId = getIntent().getStringExtra("city_key");
        result=findViewById(R.id.result);



        ArrayList<String> newArray= new ArrayList<>();
        DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        //changeTable is the function that returns only the gas prices based on user selection from DatabaseAccess
        // b = db.rawQuery("SELECT gasPrices_price FROM Mcallen WHERE CityID = '"+name+"'", new String[]{});
        //can be found in DatabaseAccess
        String all = databaseAccess.Changetable(sessionId);
        //trying to split the string bc it contains all gasprices in a single line and variable
        String[] split = all.split("\\s+");

        //just prints the whole string
        result.setText(all);

        //newArray.add(split); //this adds an element to the list.







    }
}