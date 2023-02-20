package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();

    public List<Animal> addAnimals(List<Animal> a) {
        this.animals.addAll(a);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable(){
        System.out.println("Animals in this zoo make the following sounds:");
        List<Sayable> result = new ArrayList<>();
        for(Animal a: animals){
            result.add(a);
        }
        result.add(this.radio);
        return result;
    }

public List<Runable> getRunable(){
    System.out.println("Running animals:");
    List<Runable> result = new ArrayList<>();
    for(Animal a: animals){
        if (a instanceof Runable) {
            result.add((Runable) a);
        }
    }
    return result;
}
    public List<Flyable> getFlyable(){
        System.out.println("Flying animals:");
        List<Flyable> result = new ArrayList<>();
        for(Animal a: animals){
            if (a instanceof Flyable) {
                result.add((Flyable) a);
            }
        }
        return result;
    }

    public Runable getFastestRunner(){
        System.out.println("The fastest animal is: ");
        List<Runable> runners = getRunable();
        //List<Integer> speeds = new ArrayList<>();
        int tempSpeed = 0;
        Runable result = null;
        for(Runable a: runners){
            if (a.speedOfRun()>tempSpeed){
                tempSpeed = a.speedOfRun();
                result = a;
            }
        }
        return result;
    }

    public Flyable getFastestFlyer(){
        System.out.println("This animal flies faster than others: ");
        List<Flyable> flyers = getFlyable();
        Flyable fastestFlyer = flyers.get(0);
        for (Flyable f : flyers){
            if (f.speedOfFlight()>fastestFlyer.speedOfFlight()){
                fastestFlyer = f;
            }
        }
        return fastestFlyer;
    }

    public List<Swimable> getSwimable(){
        System.out.println("Swimming animals:");
        List<Swimable> result = new ArrayList<>();
        for(Animal a: animals){
            if (a instanceof Swimable) {
                result.add((Swimable) a);
            }
        }
        return result;
    }

    public Swimable getFastestSwimmer(){
        System.out.println("This animal swims faster than others: ");
        List<Swimable> swimmers = getSwimable();
        Swimable fastestSwimmer = swimmers.get(0);
        for (Swimable f : swimmers){
            if (f.speedOfSwimming()>fastestSwimmer.speedOfSwimming()){
                fastestSwimmer = f;
            }
        }
        return fastestSwimmer;
    }
}
