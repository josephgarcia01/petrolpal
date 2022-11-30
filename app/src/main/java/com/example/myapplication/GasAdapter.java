package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GasAdapter extends RecyclerView.Adapter<GasAdapter.ViewHolder> {
    GasData[] GasData;
    Context context;


    public GasAdapter(GasData[] GasData, Display_Gas_Stations display_gas_stations) {
        this.GasData = GasData;
        this.context = display_gas_stations;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.gas_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final GasData GasDataList = GasData[position];
        holder.TextViewGasName.setText(GasDataList.getGasName());
        holder.TextViewGasAddress.setText(GasDataList.getGasAddress());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, GasDataList.getGasName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return GasData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView TextViewGasName;
        TextView TextViewGasAddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextViewGasName = itemView.findViewById(R.id.GasName);
            TextViewGasAddress = itemView.findViewById(R.id.GasAddress);
        }
    }
}
