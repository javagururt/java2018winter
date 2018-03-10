package com.javaguru.lesson6.car;

class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setManufacturer("Audi");
        car.setYear(2015);

        System.out.println(car.getColor());
        System.out.println(car.getManufacturer());
        System.out.println(car.getYear());
        System.out.println(car.getSpeed());

        car.drive();

        System.out.println("Current speed: " + car.getSpeed());

        car.stop();

        System.out.println("Current speed: " + car.getSpeed());
    }
}
