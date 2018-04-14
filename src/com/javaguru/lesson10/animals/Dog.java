package com.javaguru.lesson10.animals;

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Woof-woof v_v");
    }

    void eat() {
        System.out.println("Omnomnom");
    }
}
