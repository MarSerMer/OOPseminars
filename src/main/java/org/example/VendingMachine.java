package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Double money = 0.00;

    public Double getMoney() {
        return money;
    }

    private List<Products> products = new ArrayList<>();

    public List<Products> getProducts() {
        return products;
    }

    public VendingMachine addProduct(Products a){
        this.products.add(a);
        return this;
    }
    public Products findProduct(String name){
        for(Products prod : getProducts()){
            if(prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
    }

    public Products buy(String name, Double price){
        Products something = findProduct(name);
        if(something==null) return null;
        System.out.println("You are buying " + name);
        if (price.equals(something.getPrice())){
            products.remove(something);
            money +=price;
            //System.out.println("You spent:" + money);
            return something;
        }
        System.out.println("Wrong price. Please take your money back.");
        return null;
    }

/*    // тут всё нормально
      // его специально переделали, и стал @Override toString (см.ниже)
    public void printList(){
        for (Products a: this.getProducts()){
            System.out.println(a);
        }
    }*/
    @Override
    public String toString() {
        StringBuilder wdProducts = new StringBuilder();
        wdProducts.append("List of all products left in vending machine:\n");
        for (Products a : this.getProducts()) {
            wdProducts.append(a.toString());
            wdProducts.append("\n");
        }
        wdProducts.append("Sum of money for all bought products: ");
        wdProducts.append(money.toString());
        wdProducts.append("\n");
        return wdProducts.toString();
    }

}
