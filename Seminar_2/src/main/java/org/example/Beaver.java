package org.example;

public class Beaver extends Herbivores implements Runable,Swimable {
    public Beaver(String animalName) {
        super(animalName);
    }

    @Override
    public int speedOfRun() {
        return 8;
    }

    @Override
    public String sound() {
        return "Heeeeee Wheeeeee";
    }

    @Override
    public int speedOfSwimming() {
        return 18;
    }

    @Override
    public String toString() {
        return "I'm a beaver. " + super.toString() + "I run " + speedOfRun() + " km/hour. My swimming speed is " + speedOfSwimming();
    }
}
