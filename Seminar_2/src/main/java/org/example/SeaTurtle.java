package org.example;

public class SeaTurtle extends Herbivores implements Runable, Swimable {
    public SeaTurtle(String animalName) {
        super(animalName);
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String sound() {
        return "Whee whee";
    }

    @Override
    public int speedOfSwimming() {
        return 22;
    }

    @Override
    public String toString() {
        return "I'm a sea turtle. " + super.toString() + "I run " + speedOfRun() + " km/hour. My swimming speed is " + speedOfSwimming();
    }
}
