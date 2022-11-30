package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
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



        GasData[] GasList = new GasData[]{
                
                new GasData(GasName[1], Gasprices[1]),
                new GasData(GasName[2], Gasprices[2]),
                new GasData(GasName[3], Gasprices[3]),
                new GasData(GasName[4], Gasprices[4]),
                new GasData(GasName[5], Gasprices[5]),
                new GasData(GasName[6], Gasprices[6]),
                new GasData(GasName[7], Gasprices[7]),
                new GasData(GasName[8], Gasprices[8]),




        };

        GasAdapter GasAdapter = new GasAdapter(GasList, Display_Gas_Stations.this);
        recyclerView.setAdapter(GasAdapter);

    /*
        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent i = new Intent(this, EditNote.class);
                i.putExtra("listItem", listItems[position]);
                startActivity(i);

            }
        });
        */

    }
}