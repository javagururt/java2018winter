package com.javaguru.lesson7.marker;

import java.util.Objects;

class Marker implements InkWritableInstrument {

    private String color;
    private boolean refillable;
    private double inkLevel;

    Marker(String color, boolean refillable, double inkLevel) {
        this.color = color;
        this.refillable = refillable;
        this.inkLevel = inkLevel;
    }

    @Override
    public void write() {
        if (isContainsInk()) {
            System.out.println("Writing...");
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
            inkLevel = 100;
        }
    }

    public boolean isRefillable() {
        return refillable;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(double inkLevel) {
        this.inkLevel = inkLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marker marker = (Marker) o;
        return refillable == marker.refillable &&
                Double.compare(marker.inkLevel, inkLevel) == 0 &&
                Objects.equals(color, marker.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, refillable, inkLevel);
    }

    @Override
    public String toString() {
        return "Marker{" +
                "color='" + color + '\'' +
                ", refillable=" + refillable +
                ", inkLevel=" + inkLevel +
                '}';
    }
}
