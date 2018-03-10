package com.javaguru.lesson6.car;

class Car {

    private static final double MAX_SPEED = 60.0;

    private String color;
    private String manufacturer;
    private double speed;
    private int year;

    Car(String color, String manufacturer, int year) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    Car() {
    }

    void drive() {
        System.out.println("Brrr brrr");
        while (true) {
            if (speed >= MAX_SPEED) {
                break;
            }
            speed++;
            System.out.println(speed);
        }
    }

    void stop() {
        System.out.println("Stop");
        speed = 0.0;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getManufacturer() {
        return manufacturer;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    double getSpeed() {
        return speed;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }
}
