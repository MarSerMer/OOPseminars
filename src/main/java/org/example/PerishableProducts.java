package org.example;

import java.util.Date;

public class PerishableProducts extends Products{
    private Integer longevity;

    public PerishableProducts(String name, Double price, Integer longevity) {
        super(name,price);
        this.longevity = longevity;
    }
    @Override
    public String toString(){
        return String.format("%s, sell during %d days",super.toString(), longevity);
    }
}
