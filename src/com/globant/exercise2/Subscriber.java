package com.globant.exercise2;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.print("Estimado(a) "+this.name+" ");
        System.out.println(s);
    }
}
