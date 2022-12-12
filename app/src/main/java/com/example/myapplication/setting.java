package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class setting extends AppCompatActivity {

    Button logout;
    ImageButton button1, button2, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().setTitle("Settings");

        logout = (Button) findViewById(R.id.button2);
        button1 = (ImageButton) findViewById(R.id.button12);
        button2 = (ImageButton) findViewById(R.id.homeicon);
        button4 = (ImageButton) findViewById(R.id.imageView3);
        Button button3 = findViewById(R.id.button3);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        SwitchMaterial switchBtn = findViewById(R.id.switchBtn);




        logout.setOnClickListener(new View.OnClickListener() {
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
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view3) {openMain();}
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view3) {openMain();}
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view3) {openProfile();}

        });

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isClicked) {
                if (isClicked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    compoundButton.setText("Night Mode");
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    compoundButton.setText("Light Mode");
                }
            }
        });

        boolean isNightModeOn = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES;
        switchBtn.setChecked(isNightModeOn);
        if (isNightModeOn){
            switchBtn.setText("Night Mode");
        } else {
            switchBtn.setText("Light Mode");
        }
    }
    public void openLogout(){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }
    public void openPrivacy(){
        Intent intent = new Intent(this, privy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }
    public void openNotify(){
        Intent intent = new Intent(this, Notify.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }
    public void openSignin(){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslideout, R.anim.rightslide);
        /*swipe right*/
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
    }
    public void openProfile(){
        Intent intent = new Intent(this, userProfile.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }

    @Override
    public void recreate(){
        finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    /*This refreshes the page when you click Night Mode instead of POPPING... lol*/
        startActivity(getIntent());
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void openSettings(){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
    }

}