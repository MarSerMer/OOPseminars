package org.example;

public class Duck extends Herbivores implements Runable, Flyable{

    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public int speedOfRun() {
        return 7;
    }

    @Override
    public String sound() {
        return "Kra kra";
    }

    @Override
    public String toString(){
        return "I'm a duck. " + super.toString() + "I run " + speedOfRun() + " km/hour. My flying speed is " + speedOfFlight();
    }

    @Override
    public int speedOfFlight() {
        return 15;
    }
}
