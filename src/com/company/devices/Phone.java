package com.company.devices;

public class Phone extends Device {
    public Phone(String marka, String model, Integer yearOfProduction, Double value) {
        super(marka, model, yearOfProduction, value);
    }

    @Override
    void turnOn() {

    }
    public void beSold(){
        System.out.println("Udało się sprzedać");
    }
}


