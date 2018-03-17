package com.javaguru.lesson7.marker;

public interface InkWritableInstrument {

    void write();

    boolean isContainsInk();

    void refill();

    boolean isRefillable();

    double getInkLevel();
}
