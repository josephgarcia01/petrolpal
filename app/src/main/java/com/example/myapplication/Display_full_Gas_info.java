package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Display_full_Gas_info extends AppCompatActivity {
    public TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_full_gas_info);


        result = (TextView)findViewById(R.id.revi);

        Bundle extras = getIntent().getExtras();

        String sessionId = getIntent().getStringExtra("position");

        result.setText(sessionId);
        /*
        DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        String[] Gasprices = databaseAccess.ReturnGasPrices(sessionId);

         */





    }
}