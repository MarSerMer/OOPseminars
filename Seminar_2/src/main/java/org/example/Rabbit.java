package org.example;

public class Rabbit extends Herbivores implements Runable{
    public Rabbit(String animalName) {
        super(animalName);
    }

    @Override
    public String toString(){
        return "I'm a rabbit. " + super.toString() + "I run " + speedOfRun() + " km/hour.";
    }
    public String sound(){
        return "Hr hr hr! ";
    }

    @Override
    public int speedOfRun(){
        return 42;
    }

}
