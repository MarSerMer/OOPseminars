package org.example;

public class Cow extends Herbivores implements Runable{
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public String toString(){
        return "I'm a cow. " + super.toString() + "I run " + speedOfRun() + " km/hour.";
    }
    public String sound(){
        return "Mooooo!";
    }

    @Override
    public int speedOfRun(){
        return 15;
    }
}
