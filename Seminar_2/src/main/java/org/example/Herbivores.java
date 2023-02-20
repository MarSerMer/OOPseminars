package org.example;

public abstract class Herbivores extends Animal{
    public Herbivores(String animalName) {
        super(animalName);
    }
    public String feed(){
        return "Vegs/Fruit/Grass";
    }

}
