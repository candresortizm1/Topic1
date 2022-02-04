package com.globant.exercise1;

public class Battery5Hr implements BatteryFactory{
    public Battery5Hr(){
        addBattery();
    }

    @Override
    public void addBattery() {
        System.out.println("Battery: 5Hr");
    }
}
