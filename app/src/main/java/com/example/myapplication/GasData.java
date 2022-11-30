package com.example.myapplication;

public class GasData {
    private String GasName;
    private String GasAddress;
    private String GasRegularPrice;
    private String TotalScore;


    public GasData(String GasName, String GasAddress, String GasRegularPrice, String TotalScore) {
        this.GasName = GasName;
        this.GasAddress = GasAddress;
        this.GasRegularPrice = GasRegularPrice;
        this.TotalScore = TotalScore;

    }

    public String getTotalScore() {
        return TotalScore;
    }

    public void setTotalScore(String TotalScore) {
        this.TotalScore = TotalScore;
    }

    public String getGasRegularPrice(){return GasRegularPrice;}

    public void setGasRegularPrice(){this.GasRegularPrice = GasRegularPrice;}



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
