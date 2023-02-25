package org.example;

import java.util.Random;

public abstract class baseHero<W extends Weapon, P extends Protection> {
    private String name;
    protected W weapon;
    protected P protection;
    int healthPoint;

    protected baseHero(String name, int healthPoint,W weapon, P protection) {
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
        this.healthPoint = healthPoint;
    }
    protected baseHero(String name,W weapon, int healthPoint) {
        this(name,healthPoint,weapon,null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

   /* @Override
    public  String toString(){
        return String.format("%, weapon: %s, health points: %f.",name,weapon,healthPoint);
    }*/

    @Override
    public String toString() {
        return "name: " + name +
                ", has a " + weapon +
                protection +
                ", healthPoint: " + healthPoint + ".";
    }

//    public void hit(baseHero attacker, baseHero victim){
//        victim.healthPoint -=attacker.weapon.Damage();
//    }

    public boolean hit (baseHero victim){
        return !victim.reduceHealth(randomDamage()); // вернет true, если удар убил жертву
    }

    public boolean reduceHealth(int damage){
        if (damage<this.protection.protection()){
            return this.healthPoint>0;
        } else {
            this.healthPoint-=(damage-this.protection.protection());
        }

        return ((this.healthPoint)>0);

    }

    public int randomDamage(){
        Random rand = new Random();
        return rand.nextInt(0,weapon.Damage()+1);
    }
}
