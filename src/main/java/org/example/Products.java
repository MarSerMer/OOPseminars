package org.example;

public class Products {
private String name; //здесь private, чтобы нельзя было отовсюду менять имя. Только тут
private Double price; //здесь private, чтобы нельзя было отовсюду менять цену. Только тут

    public Products(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return String.format("Product: %s, price: %.2f",name,price);
    }
}
