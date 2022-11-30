package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import android.os.Bundle;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Activity2 extends AppCompatActivity {


    //Dropbox
    String[] cities = {"Edinburg", "Pharr", "Mcallen", "Weslaco", "test"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItem;

    private Button button;

    //SQL
    public TextView result_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        autoCompleteTextView = findViewById(R.id.auto_complete_text);
        adapterItem = new ArrayAdapter<String>(this, R.layout.list_item, cities);
        result_address=findViewById(R.id.result);




        autoCompleteTextView.setAdapter(adapterItem);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(Activity2.this, "Item: "+ item, Toast.LENGTH_SHORT).show();


                DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                //String all = databaseAccess.Changetable(item);
                //result_address.setText(all);
                // databaseAccess.close();


                Intent openSetPin = new Intent(Activity2.this, Display_Gas_Stations.class);
                String city =  item;
                 // the city_key is the city that the user chose and sends it to the next activity
                // so that we can use sql functions and retrieve data in Dispaly_gas_stations.java
                openSetPin.putExtra("city_key", city);
                startActivity(openSetPin);



            }
        });

    }
}