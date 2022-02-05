package com.globant.exercise1;

public class Memory16GB implements Memory {
    public Memory16GB(){
        addMemory();
    }

    @Override
    public void addMemory() {
        System.out.println("Memoria: 16GB");
    }
}
