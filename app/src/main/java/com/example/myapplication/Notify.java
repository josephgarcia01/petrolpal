package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.os.Bundle;

public class Notify extends AppCompatActivity {

    private Switch mySwitch;
    ImageButton button;
    ImageButton button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        getSupportActionBar().setTitle("Notifications");

        button = (ImageButton) findViewById(R.id.ImageButton5);
        button1 = (ImageButton) findViewById(R.id.imageView3);
        button2 = (ImageButton) findViewById(R.id.button7);
        button3 = (ImageButton) findViewById(R.id.imageView4);
        mySwitch = (Switch) findViewById(R.id.switch1);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view3) {openSettings();}
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }
    public void openProfile(){
        Intent intent = new Intent(this, userProfile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/

    }
    public void openSettings2(){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/

    }
    public void openSettings(){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leftslide, R.anim.rightslideout);
        /*swipe left*/
    }
}