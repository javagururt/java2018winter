package com.javaguru.lesson7.robots;

class SayHelloWorldService implements Service {
    @Override
    public void execute() {
        System.out.println("Hello World!");
    }
}
