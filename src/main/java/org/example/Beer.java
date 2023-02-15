package org.example;

public class Beer extends  Products{
    private Integer alcohol = 0;

    public Beer(String name, Double price) {
        super(name, price);
    }
    public Beer(String name, Double price,Integer alcohol) {
        this(name, price); //this здесь специально, для тренировки, т.к. super уже есть в конструкторе выше
        this.alcohol = alcohol;
    }

    public Integer getAlcohol() {
        return alcohol;
    }

    @Override
    public String toString(){
        return String.format("%s, alcohol: %d", super.toString(), alcohol);
    }
}
