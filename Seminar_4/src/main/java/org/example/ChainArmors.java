package org.example;

public class ChainArmors implements Protection{
    private String name;
    int protectionPoints;

    public ChainArmors(String name, int protectionPoints) {
        this.name = name;
        this.protectionPoints = protectionPoints;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

    @Override
    public int protection() {
        return protectionPoints;
    }
    @Override
    public String toString(){
        return "Protected with Chain Armor " + name +
                "(protectionPoint: " + protectionPoints + ")";
    }
}
