package com.javaguru.lesson10.students;

public class JuniorDeveloper extends Student {

    public JuniorDeveloper(String name) {
        super(name);
    }

    @Override
    public void learnSomething() {
        System.out.println("Junior: So so");
    }

    public void writeCode() {
        System.out.println("WOWOWO I'm writing code WOWO O.o ");
    }
}
