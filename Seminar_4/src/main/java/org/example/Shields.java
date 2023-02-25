package org.example;

public class Shields implements Protection{
    private String name;
    int protectionPoints;

    @Override
    public int protection() {
        return protectionPoints;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

    public Shields(String name, int protectionPoints) {
        this.name = name;
        this.protectionPoints = protectionPoints;
    }
    @Override
    public String toString(){
        return "Protected with Shield " + name +
                "(pritectionPoint: " + protectionPoints + ")";
    }
}
