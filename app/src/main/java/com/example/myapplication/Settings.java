package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Settings extends Fragment {

    private Button button1, button2, button3, button4, button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    public void buttonClicked(View view) {

        if (view.getId() == R.id.button1) {
            // button1 action
        } else if (view.getId() == R.id.button2) {
            //button2 action
        } else if (view.getId() == R.id.button3) {
            //button3 action
        }

    }

}