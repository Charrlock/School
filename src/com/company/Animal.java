package com.company;

import java.io.File;

public class Animal {

    final String species;
    private Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 20.0;

    public Animal(String species) {
        this.species = species;
        if(species =="dog")
        {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else if(species == "mouse" )
        {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
        else if (species == "lion")
        {
            this.weight = DEFAULT_LION_WEIGHT;
        }
    }

    void feed(){
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

    void walk(){

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
}