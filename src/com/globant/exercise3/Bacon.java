package com.globant.exercise3;

public class Bacon extends Topping{
    public Bacon(HotDog hotDogTopping) {
        super(hotDogTopping);
    }

    @Override
    public void cook() {
        hotDogTopping.cook();
        addTopping();
    }

    protected void addTopping(){
        System.out.print(", tocineta");
    }

}
