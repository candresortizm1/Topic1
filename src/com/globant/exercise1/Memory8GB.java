package com.globant.exercise1;

public class Memory8GB implements Memory {
    public Memory8GB(){
        addMemory();
    }

    @Override
    public void addMemory() {
        System.out.println("Memoria: 8GB");
    }
}
