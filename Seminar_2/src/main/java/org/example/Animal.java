package org.example;
//Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки издают и тд), а наследники собственные параметры (тип перемещения). Можно сделать дополнительную абстракцию, хищники и травоядные
public abstract class Animal implements Sayable{
    String animalName;
    String sound;

    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public abstract String feed();
    @Override
    public String toString(){
        return String.format("My name is %s .", animalName);
    }
}

