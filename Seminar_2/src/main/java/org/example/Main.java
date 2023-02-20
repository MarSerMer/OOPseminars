package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"), new Dog("Rex"), new Rabbit("Fluffy"), new Cow("Boorenka"), new Duck("Kryakva"), new Colibri("Tiny Bird"), new SeaTurtle("Tortuga"), new Beaver("El Bobrolio")));

        //сначала было так (до создания Radio и Sayable):
        /*for (Animal a : zoopark.getAnimals()){
            System.out.println(a.sound());
        }*/

        for (Sayable a : zoopark.getSayable()){
            System.out.println(a.sound());
        }
        System.out.println("-------");
        for (Runable a : zoopark.getRunable()){
            System.out.println(a);
        }
        System.out.println("-------");
        for (Flyable a : zoopark.getFlyable()){
            System.out.println(a);
        }
        System.out.println("-------");
        for (Swimable a : zoopark.getSwimable()){
            System.out.println(a);
        }
        System.out.println("-------");

        System.out.println(zoopark.getFastestRunner());
        System.out.println(zoopark.getFastestFlyer());
        System.out.println(zoopark.getFastestSwimmer());
    }
}