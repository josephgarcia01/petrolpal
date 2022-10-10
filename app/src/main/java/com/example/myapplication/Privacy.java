package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;


import android.os.Bundle;

public class Privacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("privacy info");

        setContentView(R.layout.activity_2);
    }

}