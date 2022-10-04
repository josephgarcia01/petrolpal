package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;


import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Petrol 2App");

        setContentView(R.layout.activity_2);
    }
}