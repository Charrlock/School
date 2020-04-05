package com.company.devices;

public class Device{
public final String marka;
public final String model;
public final Integer yearOfProduction;
public final Double cena;


    public Device(String marka, String model, Integer yearOfProduction, Double cena) {
        this.marka = marka;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.cena = cena;
    }
}
