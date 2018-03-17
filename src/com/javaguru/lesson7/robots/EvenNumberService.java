package com.javaguru.lesson7.robots;

class EvenNumberService implements Service {

    private int number;

    public EvenNumberService(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
