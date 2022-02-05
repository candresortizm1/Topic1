package com.globant.exercise1;

public class BlueCase implements CaseColor {
    public BlueCase(){
        addCaseColor();
    }

    @Override
    public void addCaseColor() {
        System.out.println("ColorCase: blue");
    }
}
