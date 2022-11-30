package com.example.myapplication;

public class GasData {
    private String GasName;
    private String GasAddress;



    public GasData(String GasName, String GasAddress) {
        this.GasName = GasName;
        this.GasAddress = GasAddress;

    }

    public String getGasName() {
        return GasName;
    }

    public void setGasName(String GasName) {
        this.GasName = GasName;
    }

    public String getGasAddress() {
        return GasAddress;
    }

    public void setGasAddress(String GasAddress) {
        this.GasAddress = GasAddress;
    }
}
