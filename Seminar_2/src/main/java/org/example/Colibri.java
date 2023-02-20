package org.example;

public class Colibri extends Herbivores implements Flyable {
    public Colibri(String animalName) {
        super(animalName);
    }

    @Override
    public int speedOfFlight() {
        return 18;
    }

    @Override
    public String sound() {
        return "Whistle chik";
    }

    @Override
    public String toString() {
        return "I'm a colibri. " + super.toString() + "My flying speed is " + speedOfFlight();
    }
}
