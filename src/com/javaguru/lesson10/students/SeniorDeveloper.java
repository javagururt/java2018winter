package com.javaguru.lesson10.students;

public class SeniorDeveloper extends MiddleDeveloper {

    public SeniorDeveloper(String name) {
        super(name);
    }

    public void solveProblems() {
        System.out.println("I'm the best of the best");
    }

    @Override
    public void learnSomething() {
        System.out.println("Senior: Nothing to learn? Or ...");
    }
}
