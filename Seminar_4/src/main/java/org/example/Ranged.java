package org.example;

public class Ranged implements Weapon{ // Ranged - дальний бой
    private String weaponName;
    private int damagePoint;
    private int range; // растояние поражения (это же оружие дальнего боя)

    public Ranged (String weaponName, int damagePoint, int range) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int Damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Ranged weapon: " + weaponName +
                "(range: " + range +
                ", damagePoint: " + damagePoint + ")";
    }
}
