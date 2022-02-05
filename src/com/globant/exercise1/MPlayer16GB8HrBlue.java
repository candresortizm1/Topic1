package com.globant.exercise1;

public class MPlayer16GB8HrBlue implements MusicPlayerFactory{
    @Override
    public Memory addMemory() {
        return new Memory16GB();
    }

    @Override
    public Battery addBattery() {
        return new Battery8Hr();
    }

    @Override
    public CaseColor addCaseColor() {
        return new BlueCase();
    }
}
