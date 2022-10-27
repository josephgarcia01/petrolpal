package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Switch;
import android.os.Bundle;

public class Notify extends AppCompatActivity {

    private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        getSupportActionBar().setTitle("Notifications");

        mySwitch = (Switch) findViewById(R.id.switch1);
    }
}