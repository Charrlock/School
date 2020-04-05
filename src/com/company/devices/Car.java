package com.company.devices;

public class Car extends Device {



        public final String kolor;


        public Car(String marka, String model, Integer yearOfProduction, String kolor, Double cena) {

            super(marka, model, yearOfProduction, cena);

            this.kolor = kolor;

        }





    public String toString(){
        return marka+ " "+model+" "+yearOfProduction;
    }
}
