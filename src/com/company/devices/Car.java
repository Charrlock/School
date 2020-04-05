package com.company.devices;

public class Car extends Device {



        public final String kolor;


        public Car(String marka, String model, Integer yearOfProduction, String kolor, Double value) {

            super(marka, model, yearOfProduction, value);

            this.kolor = kolor;

        }





    public String toString(){
        return marka+ " "+model+" "+yearOfProduction;
    }

    @Override
    void turnOn() {

    }


    public void beSold(){
        System.out.println("Udało się sprzedać");
    }
}
