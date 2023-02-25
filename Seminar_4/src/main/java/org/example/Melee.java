package org.example;

public class Melee implements Weapon{ // Melee - ближний бой

    private String weaponName;
    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public int Damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Melee weapon " + weaponName +
                "(damagePoint: " + damagePoint + ")";
    }
}
