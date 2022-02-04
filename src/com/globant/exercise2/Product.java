package com.globant.exercise2;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    private String name;
    private float price;
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o){
        observers.add(o);
    };

    public void detach(Observer o){
        observers.remove(o);
    };

    private void notifyUpdate(String m){
        for (Observer o : observers) {
            o.update(m);
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyUpdate("El producto: "+this.getName()+" cambió su precio a: "+price);
    }
}
