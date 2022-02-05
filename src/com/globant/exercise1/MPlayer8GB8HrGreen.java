package com.globant.exercise1;

public class MPlayer8GB8HrGreen implements MusicPlayerFactory{
    @Override
    public Memory addMemory() {
        return new Memory8GB();
    }

    @Override
    public Battery addBattery() {
        return new Battery8Hr();
    }

    @Override
    public CaseColor addCaseColor() {
        return new GreenCase();
    }
}
