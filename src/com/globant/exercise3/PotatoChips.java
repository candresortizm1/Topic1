package com.globant.exercise3;

public class PotatoChips extends Topping{
    public PotatoChips(HotDog hotDogTopping) {
        super(hotDogTopping);
    }

    @Override
    public void cook() {
        hotDogTopping.cook();
        addTopping();
    }

    protected void addTopping(){
        System.out.print(", papa triturada");
    }
}
