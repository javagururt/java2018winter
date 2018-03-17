package com.javaguru.lesson7.marker;

class Pen implements InkWritableInstrument {

    private String color;
    private boolean refillable;
    private double inkLevel;

    public Pen(String color, boolean refillable, double inkLevel) {
        this.color = color;
        this.refillable = refillable;
        this.inkLevel = inkLevel;
    }

    @Override
    public void write() {
        if (isContainsInk()) {
            System.out.println("Pen writing...");
            inkLevel--;
        }
    }

    @Override
    public boolean isContainsInk() {
        return inkLevel > 0;
    }

    @Override
    public void refill() {
        if (isRefillable()) {
            inkLevel = 90;
        }
    }

    @Override
    public boolean isRefillable() {
        return refillable;
    }

    @Override
    public double getInkLevel() {
        return inkLevel;
    }

    public String getColor() {
        return color;
    }
}
