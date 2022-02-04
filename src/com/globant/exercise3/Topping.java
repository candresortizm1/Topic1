package com.globant.exercise3;

public abstract class Topping implements HotDog{

    protected HotDog hotDogTopping;

    public Topping(HotDog hotDogTopping) {
        this.hotDogTopping = hotDogTopping;
    }

    @Override
    public void cook() {
        hotDogTopping.cook();
    }

    protected void addTopping(){

    };

}
