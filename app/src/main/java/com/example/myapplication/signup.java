package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class signup extends AppCompatActivity implements View.OnClickListener{

    EditText usernameNew, passwordNew, confPassword;
    UserDatabase userDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        usernameNew = (EditText) findViewById(R.id.username);
        passwordNew = (EditText) findViewById(R.id.password);
        confPassword = (EditText) findViewById(R.id.confpassword);
        MaterialButton createAccount = (MaterialButton)  findViewById(R.id.button10);
        userDatabase = new UserDatabase(this);

        createAccount.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.button10:
                String username = usernameNew.getText().toString();
                String password = passwordNew.getText().toString();
                String confpassword = confPassword.getText().toString();

                if(username.equals("")||password.equals("")||confpassword.equals(""))
                    Toast.makeText(signup.this, "Please enter the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (password.equals(confpassword)) {
                        Boolean checkuser = userDatabase.checkusername(username);
                        if (!checkuser) {
                            Boolean insert = userDatabase.insertData(username, password);
                            if (insert) {
                                Toast.makeText(signup.this, "Registered successfully! Please login.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(this, setting.class);
                                startActivity(intent);
                            } else if (checkuser) {
                                Toast.makeText(signup.this, "User already exists. Please sign in.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }else{
                        Toast.makeText(signup.this, "Please enter the correct password", Toast.LENGTH_SHORT).show();
                    }
                }
        }
    }
}