package com.globant.exercise3;

public class Main {

    public static void main(String[] args) {
        HotDog perroCaliente = new HotDogBase();
        perroCaliente.cook();
        System.out.println();
        perroCaliente = new Sauce(perroCaliente);
        perroCaliente.cook();
        System.out.println();
        perroCaliente = new Bacon(perroCaliente);
        perroCaliente.cook();
        System.out.println();
        perroCaliente = new PotatoChips(perroCaliente);
        perroCaliente.cook();
        System.out.println();
        perroCaliente = new Bacon(perroCaliente);

        perroCaliente.cook();
        System.out.println();
    }
}
