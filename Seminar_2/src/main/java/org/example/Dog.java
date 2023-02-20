package org.example;

public class Dog extends Predators implements Runable{
    public Dog(String animalName) {
        super(animalName);
    }
    @Override
    public String toString(){
        return "I'm a dog. " + super.toString() + "I run " + speedOfRun() + " km/hour.";
    }
    public String sound(){
        return "Bow wow wow! ";
    }
@Override
    public int speedOfRun(){
        return 35;
    }
}
