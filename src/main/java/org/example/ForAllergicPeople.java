package org.example;

public class ForAllergicPeople extends Products{
    private String freeFrom = " ";
    public ForAllergicPeople(String name, Double price, String freeFrom) {
        super(name, price);
        this.freeFrom = freeFrom;
    }
    @Override
    public String toString(){
        return String.format("%s, %s-free",super.toString(),freeFrom);
    }
}
