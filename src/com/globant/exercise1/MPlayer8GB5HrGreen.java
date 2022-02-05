package com.globant.exercise1;

public class MPlayer8GB5HrGreen implements MusicPlayerFactory{

    @Override
    public Memory addMemory() {
        return new Memory8GB();
    }

    @Override
    public Battery addBattery(){
        return new Battery5Hr();
    };

    @Override
    public CaseColor addCaseColor(){
        return new GreenCase();
    };
}
