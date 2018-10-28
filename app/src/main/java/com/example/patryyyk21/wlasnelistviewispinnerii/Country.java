package com.example.patryyyk21.wlasnelistviewispinnerii;

public class Country {

    private String countryName;
    private int countryFlag;

    public Country(String name, int flag){
        SetCountryName(name);
        SetCountryFlag(flag);
    }

    private void SetCountryName(String name){
        this.countryName = name;
    }

    private void SetCountryFlag(int flaga){
        this.countryFlag = flaga;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }
}
