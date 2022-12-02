package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity{

    private Button button, button2;
    private ImageButton button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Welcome!");
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button11);
        button3 = (ImageButton) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivity2();}
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view2) {openLogin();}
    });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view3) {openSettings();}

        });

    }


    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
    }

    public void openLogin(){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }

    public void openSettings(){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }

}