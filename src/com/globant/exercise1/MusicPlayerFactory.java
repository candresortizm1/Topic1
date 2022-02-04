package com.globant.exercise1;

public interface MusicPlayerFactory {
    MemoryFactory addMemory();
    BatteryFactory addBattery();
    CaseColorFactory addCaseColor();
}
