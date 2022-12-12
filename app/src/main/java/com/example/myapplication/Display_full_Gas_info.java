package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Display_full_Gas_info extends AppCompatActivity {
    public TextView Address;
    public TextView Title;
    public TextView Regular_price;
    public TextView phone_number;
    public TextView midgrade_price;
    public TextView premium;
    public TextView diesel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_full_gas_info);
        getSupportActionBar().setTitle("PetrlPal's Finest");
        ImageView imageView = (ImageView) findViewById(R.id.imageView7);
        imageView.setImageResource(R.drawable.gmap);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);


        Address = (TextView)findViewById(R.id.Address);
        Title = (TextView)findViewById(R.id.Title);
        Regular_price = (TextView)findViewById(R.id.regular_price);
        phone_number = (TextView)findViewById(R.id.phonenumber);
        midgrade_price = (TextView)findViewById(R.id.midgrade);
        premium = (TextView)findViewById(R.id.premium);
        diesel = (TextView)findViewById(R.id.diesel);

        Button link = (Button) findViewById(R.id.link2);




        Bundle extras = getIntent().getExtras();
        //ID
        String id_position = getIntent().getStringExtra("position");









        DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());

        String address = databaseAccess.Return_D_address(id_position);

        String title  = databaseAccess.Return_D_title(id_position);

        String url = databaseAccess.Return_D_url(id_position);

        String regular_price = databaseAccess.Return_D_regular_price(id_position);

        String phone = databaseAccess.Return_D_phonenumber(id_position);

        String mid_price = databaseAccess.Return_D_mid_price(id_position);

        String premium_price = databaseAccess.Return_D_prem_price(id_position);

        String diesel_price = databaseAccess.Return_D_diesel_price(id_position);

        String link_str = databaseAccess.Return_D_link(id_position);


        Address.setText(address);

        // String Gasprices = databaseAccess.Return_name_id(id_position, name_gas);
        Title.setText(title);

        Regular_price.setText(regular_price);

        phone_number.setText(phone);

        midgrade_price.setText(mid_price);

        premium.setText(premium_price);

        diesel.setText(diesel_price);




        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link_str));
                startActivity(intent);
            }
        });





        Uri mapUri = Uri.parse(url);

        // Create an intent with the action set to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);

        // Make the intent explicit by setting the package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the intent


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                startActivity(mapIntent);
            }
        });
        //startActivity(mapIntent);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/10/yyyy");
        String currentDate = simpleDateFormat.format(new Date());

        TextView textView = (TextView) findViewById(R.id.lastupdated);
        textView.setText(currentDate);





    }
}