package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class SettingsFragment extends Fragment {
/*
    public SettingsFragment(){
        //empty constructor
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        //return inflater.inflate(R.layout.fragment_settings, container, false);

        Button button7 = (Button) view.findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Settings.class);
                startActivity(in);
            }
        });

    return view;
    }

}
