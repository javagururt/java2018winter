package com.javaguru.lesson10.students;

class SeniorDeveloper extends MiddleDeveloper {

    public SeniorDeveloper(String name) {
        super(name);
    }

    void solveProblems() {
        System.out.println("I'm the best of the best");
    }

    @Override
    void learnSomething() {
        System.out.println("Senior: Nothing to learn? Or ...");
    }
}
