package com.globant.exercise1;

public class Battery8Hr implements Battery {
    public Battery8Hr(){
        addBattery();
    }

    @Override
    public void addBattery() {
        System.out.println("Battery: 8Hr");
    }
}
