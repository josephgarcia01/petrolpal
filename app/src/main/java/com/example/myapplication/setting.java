package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().setTitle("Settings");

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogout();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNotify();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAppearance();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPrivacy();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSignin(); }
        });
    }
    public void openLogout(){
        Intent intent = new Intent(this, Logout.class);
        startActivity(intent);
    }
    public void openPrivacy(){
        Intent intent = new Intent(this, privy.class);
        startActivity(intent);
    }
    public void openNotify(){
        Intent intent = new Intent(this, Notify.class);
        startActivity(intent);
    }
    public void openAppearance(){
        Intent intent = new Intent(this, Appearance.class);
        startActivity(intent);
    }
    public void openSignin(){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
    }


}