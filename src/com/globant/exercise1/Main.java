package com.globant.exercise1;

public class Main {

    public static void main(String[] args) {
        MusicPlayer rep1;

        String[] tiposReproductor = {"8GB8HrAzul","8GB8HrVerde","8GB5HrAzul","8GB5HrVerde","16GB8HrAzul","16GB8HrVerde","16GB5HrAzul","16GB5HrVerde"};
        for (String tipo : tiposReproductor ) {
            rep1 = MusicPlayerConfig.configurePlayer(tipo);
            System.out.println("________________________");
        }
    }
}
