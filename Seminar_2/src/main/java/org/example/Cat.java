package org.example;

public class Cat extends Predators implements Runable{
    public Cat(String animalName) {
        super(animalName);
    }
    @Override
    public String toString(){
        return "I'm a cat. "  + super.toString() + "I run " + speedOfRun() + " km/hour.";
    }
    public String sound(){
        return "Meow!";
    }
    @Override
    public int speedOfRun(){
        return 28;
    }
}
