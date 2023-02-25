package org.example;

public class Footman extends baseHero<Melee,ChainArmors>{

    public Footman(String name, Melee weapon,ChainArmors protection,int healthPoint) {
        super(name,healthPoint,weapon,protection);
    }
    public Footman(String name, Melee weapon,int healthPoint){
        super(name,weapon,healthPoint);
    }

    @Override
    public String toString() {
        return "Footman, " + super.toString();
    }
}
