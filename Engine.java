package com.company.details;

public class Engine {
    int power;
    String manufacturer;


    public void setPower(int carPower){
        power=carPower;
    }
    public int getPower(){
        return power;
    }
    public void setManufacturer(String carManufacturer){
        manufacturer=carManufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public Engine(int enginPower, String EnginManufacturer){
        this.power=enginPower;
        this.manufacturer=EnginManufacturer;

    }
}

