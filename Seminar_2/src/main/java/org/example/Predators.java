package org.example;

public abstract class Predators extends Animal {
    public Predators(String animalName) {
        super(animalName);
    }
    public String feed (){
        return "Meat";
    }
}
