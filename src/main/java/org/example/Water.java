package org.example;

public class Water extends Products {

    private String sparkling = "sparkling"; //sparkling or still
    private String name = "Water";
    public Water(String name, Double price, String sparkling) {
        super(name, price);
        this.sparkling = sparkling;
    }
   @Override
    public String toString(){
        return  String.format("%s, %s", super.toString(), sparkling);
   }


}
