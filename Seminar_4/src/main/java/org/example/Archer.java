package org.example;

public class Archer extends baseHero<Ranged,Shields>{


    public Archer(String name, int healthPoint, Ranged range,Shields protection) {
        super(name, healthPoint, range,protection);
    }
    public Archer (String name, Ranged weapon,int healthPoint){
        super(name,weapon,healthPoint);
    }

    // ЭТО (см. ниже) было вот так до того, как мы ввели обощение для baseHero<W extends Weapon>(было просто baseHero
    // и нужно было кастовать оружие, см.(Ranged)weapon)). Теперь кастовать НЕ НАДО, т.к.
    // оно уже в объявлении класса Archer мы пишем, что вот этим вот ЭК будет дано оружие только типа Ranged
    //
//    public int range(){
//        return ((Ranged)weapon).getRange();
//    }
    // теперь правильно так:
    public int range(){
       return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }
}

