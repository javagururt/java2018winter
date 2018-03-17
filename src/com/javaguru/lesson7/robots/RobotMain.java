package com.javaguru.lesson7.robots;

class RobotMain {

    public static void main(String[] args) {
        Service service = new EvenNumberService(10);

        Robot robot = new Robot();

        robot.setService(service);
        robot.setName("Tolya");

        robot.turnOn();
    }

}
