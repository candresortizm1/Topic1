package com.globant.exercise3;

public class Sauce extends Topping{
    public Sauce(HotDog hotDogTopping) {
        super(hotDogTopping);
    }

    @Override
    public void cook() {
        hotDogTopping.cook();
        addTopping();
    }

    protected void addTopping(){
        System.out.print(", salsa");
    }
}
