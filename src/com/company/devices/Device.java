package com.company.devices;

public abstract class Device implements Soldable{
public final String marka;
public final String model;
public final Integer yearOfProduction;
public final Double value;


    public Device(String marka, String model, Integer yearOfProduction, Double value) {
        this.marka = marka;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    abstract void turnOn();

    @Override
    public void beSold(){
    }
}
