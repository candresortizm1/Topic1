package com.globant.exercise1;

public class GreenCase implements CaseColor {
    public GreenCase(){
        addCaseColor();
    }

    @Override
    public void addCaseColor() {
        System.out.println("ColorCase: green");
    }
}
