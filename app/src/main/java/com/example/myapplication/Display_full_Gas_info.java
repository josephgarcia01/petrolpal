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
import android.widget.TextView;

public class Display_full_Gas_info extends AppCompatActivity {
    public TextView Address;
    public TextView Title;
    public TextView Regular_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_full_gas_info);

        Button myButton = (Button) findViewById(R.id.button4);


        Address = (TextView)findViewById(R.id.Address);
        Title = (TextView)findViewById(R.id.Title);
        Regular_price = (TextView)findViewById(R.id.regular_price);

        Bundle extras = getIntent().getExtras();
        //ID
        String id_position = getIntent().getStringExtra("position");







        DataBaseAccess  databaseAccess = DataBaseAccess.getInstance(getApplicationContext());

        String address = databaseAccess.Return_D_address(id_position);

        String title  = databaseAccess.Return_D_title(id_position);

        String url = databaseAccess.Return_D_url(id_position);

        String regular_price = databaseAccess.Return_D_regular_price(id_position);



        Address.setText(address);

       // String Gasprices = databaseAccess.Return_name_id(id_position, name_gas);
        Title.setText(title);

        Regular_price.setText(regular_price);


        Uri mapUri = Uri.parse(url);

        // Create an intent with the action set to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);

        // Make the intent explicit by setting the package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the intent


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                startActivity(mapIntent);
            }
        });
        //startActivity(mapIntent);








    }
}