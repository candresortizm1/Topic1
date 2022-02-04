package com.globant.exercise3;

public class PineappleChunks extends Topping{
    public PineappleChunks(HotDog hotDogTopping) {
        super(hotDogTopping);
    }

    @Override
    public void cook() {
        hotDogTopping.cook();
        addTopping();
    }

    protected void addTopping(){
        System.out.println(", pedazos de piña");
    }
}
