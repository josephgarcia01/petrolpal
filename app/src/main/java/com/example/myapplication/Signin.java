package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Signin extends AppCompatActivity implements View.OnClickListener{

    EditText username, password;
    UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        getSupportActionBar().setTitle("Sign In");

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        TextView accountCreate=(TextView) findViewById(R.id.accountCreate);
        MaterialButton login = (MaterialButton) findViewById(R.id.button9);
        userDatabase = new UserDatabase(this);

        login.setOnClickListener(this);
        accountCreate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.button9:

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals("")) {
                    Toast.makeText(Signin.this, "Please enter the fields below", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkuserpass = userDatabase.checkusernamepassword(user, pass);
                    if(checkuserpass){
                        Toast.makeText(Signin.this, "Sign in successful!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, MainActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Signin.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

                break;

            case R.id.accountCreate:

                Intent intent2 = new Intent(this, signup.class);
                startActivity(intent2);
                break;
        }
    }
}