package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;


public class Display_Gas_Stations extends AppCompatActivity {
    public TextView result;
    public TextView resultaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_gas_stations);
        getSupportActionBar().setTitle("Select your gas station");
        Bundle extras = getIntent().getExtras();
        String sessionId = getIntent().getStringExtra("city_key");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();




        String[] Gasprices = databaseAccess.ReturnGasPrices(sessionId);

        String[] GasAddress = databaseAccess.ReturnAddress(sessionId);

        String[] GasName = databaseAccess.ReturnName(sessionId);

        String[] GasScore = databaseAccess.ReturnTotalScore(sessionId);

        String[] ID_getter = databaseAccess.Return_id(sessionId);



        GasData[] GasList = new GasData[]{
                
                new GasData(GasName[1], GasAddress[1], Gasprices[1],GasScore[1], ID_getter[1]),
                new GasData(GasName[2], GasAddress[2], Gasprices[2],GasScore[2], ID_getter[2]),
                 new GasData(GasName[3], GasAddress[3], Gasprices[3],GasScore[3], ID_getter[3]),
                 new GasData(GasName[4], GasAddress[4], Gasprices[4],GasScore[4],  ID_getter[4]),
                 new GasData(GasName[5], GasAddress[5], Gasprices[5],GasScore[5],  ID_getter[5]),
                 new GasData(GasName[6], GasAddress[6], Gasprices[6],GasScore[6],  ID_getter[6]),
                 new GasData(GasName[7], GasAddress[7], Gasprices[7],GasScore[7],  ID_getter[7]),
                 new GasData(GasName[8], GasAddress[8], Gasprices[8],GasScore[8],  ID_getter[8]),

                 new GasData(GasName[9], GasAddress[9], Gasprices[9],GasScore[9],  ID_getter[9]),
                 new GasData(GasName[10], GasAddress[10], Gasprices[10],GasScore[10],  ID_getter[10]),
                 new GasData(GasName[11], GasAddress[11], Gasprices[11],GasScore[11],  ID_getter[11]),
                 new GasData(GasName[12], GasAddress[12], Gasprices[12],GasScore[12],  ID_getter[12]),
                 new GasData(GasName[13], GasAddress[13], Gasprices[13],GasScore[13],  ID_getter[13]),
             //   new GasData(GasName[14], GasAddress[14], Gasprices[14],GasScore[14],  ID_getter[14]),
             //  new GasData(GasName[15], GasAddress[15], Gasprices[15],GasScore[15],  ID_getter[15]),





        };


        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
        GasAdapter GasAdapter = new GasAdapter(GasList, Display_Gas_Stations.this);
        recyclerView.setAdapter(GasAdapter);


         



    }
}