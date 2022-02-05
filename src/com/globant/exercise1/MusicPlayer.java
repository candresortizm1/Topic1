package com.globant.exercise1;

public class MusicPlayer {
    private Memory memory;
    private Battery battery;
    private CaseColor caseColor;

    public MusicPlayer(MusicPlayerFactory factory) {
        memory = factory.addMemory();
        battery = factory.addBattery();
        caseColor = factory.addCaseColor();
    }

}
