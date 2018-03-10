package com.javaguru.lesson6.car;

class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Red", "Audi", 2016);

        System.out.println(car.getColor());
        System.out.println(car.getManufacturer());
        System.out.println(car.getYear());
        System.out.println(car.getSpeed());

        car.drive();

        System.out.println("Current speed: " + car.getSpeed());

        car.stop();

        System.out.println("Current speed: " + car.getSpeed());

        Car bmw = new Car("BMW");

        bmw.setYear(2016);
        bmw.setColor("Black");
        bmw.setSpeed(30);

        bmw.drive();

        Car volvo = new Car();
        volvo.setColor("White");
        volvo.setYear(2016);
        volvo.setManufacturer("Volvo");

        System.out.println(volvo.getYear());
    }
}
