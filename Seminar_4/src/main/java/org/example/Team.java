package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends baseHero> implements Iterable<T>{
    List<T> team = new ArrayList<>();
    public void addTeamMember(T h){
       this.team.add(h);
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

/*    @Override // то же самое, но версия покороче см. выше
    public Iterator<T> iterator() {
        return new Iterator() {
            private int count = 0;
            @Override
            public boolean hasNext() {
                return count<team.size();
            }

            @Override
            public Object next() {
                return team.get(count++);
            }
        };
    }*/

    public int getTeamHealth(){
        int result = 0;
        for (T hero:team){
            result +=hero.getHealthPoint();
        }
        return result;
    }
// мой вариант (вариант с семинара см. ниже):
//    public int getMaxRangeInTeam(){
//        int maxRange = 0;
//        for (T hero:this){
//            if (hero.weapon instanceof Ranged){
//
//                if (((Ranged) hero.weapon).getRange()>maxRange){
//                    maxRange=((Ranged) hero.weapon).getRange();
//                }
//            }
//        }
//        return maxRange;
//    }
    //  вариант с семинара (был на экране):
    public int getMaxRangeInTeam(){
        int maxRange = 0;
        for (T hero:this){
            if (hero instanceof Archer){
                Archer ar = (Archer)hero;
                if (ar.range()>maxRange){
                    maxRange=ar.range();
                }
            }
        }
        return maxRange;
    }

    public int getTeamPower(){
        int power = 0;
        for (T hero:this){
            power += hero.weapon.Damage();
        }
        return power;
    }
    public int getMinimalTeamProtection(){
        int minProt = 10000;
        for (T hero:this) {
            if(hero.protection.protection()<minProt){
                minProt=hero.protection.protection();
            }
        }
        return minProt;
    }
}
