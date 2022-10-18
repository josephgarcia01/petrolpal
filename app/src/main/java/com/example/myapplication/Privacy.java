package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;


import android.os.Bundle;
import android.widget.Toast;

public class Privacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("privacy info");

        setContentView(R.layout.privacy);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(),
                        "data:" + bundle.getString("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }

    }

}