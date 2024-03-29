package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private Car car;

    private Double salary;

    public final static Double DEFAULT_HUMAN_WIGHT = 70.0;
    public Human() {
        super("homo sapiens");
    }

    public void shareCar(Car dzielony){
        car=dzielony;
    }

    public void setCar(Car car) {
        if(salary*3>car.value) {
            System.out.println("Samochód kupiony za gotówke");
            this.car = car;
        }
        else if(salary*12>car.value){
            System.out.println("Samochód kupiony na kredyt");
            this.car = car;
        }
        else{
            System.out.println("Na samochód cię nie stać biedaku");
        }
    }

    public void getCar() {
        System.out.println("I'm driving : " + car);
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now: " + salary);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
    public String toString(){
        return this.firstName +""+ this.lastName; }
}