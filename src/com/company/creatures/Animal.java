package com.company.creatures;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.File;

public class Animal implements Edible, Soldable  {

    public final String species;
    protected Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 20.0;

    public Animal(String species) {
        this.species = species;
        if(species.equals("dog"))
        {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else if(species.equals("mouse"))
        {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
        else if (species.equals("lion"))
        {
            this.weight = DEFAULT_LION_WEIGHT;
        }
    }

    public void feed(){
        if(weight>0)
            {
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
            }
        else
        {
            System.out.println("You can't feed me BECAUSE I'M FUCKING DEAD!!!!");
        }
    }

    public void walk(){

        if(--weight<=0)
            {
            System.out.println("I'm fucking dead bro");
            }
        else if(weight<=2)
            {
                System.out.println("FEED MEEEEEEEEEEEE!!!!!!!!!!!!111111111111111 ");
            }
        else
        {
            System.out.println("Thx for cardio bro my weight is now " + weight);
        }
    }

    @Override
    public void beEaten() {
        if (this instanceof Human) {
            try {
                throw new Exception("No way");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            this.weight = 0.0;
        }


    }

    @Override
    public void beSold() {
        if (this instanceof Human) {
            try {
                throw new Exception("You cant sell people");
            }catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("Udało się sprzedać");
        }
    }
}
