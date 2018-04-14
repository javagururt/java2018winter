package com.javaguru.lesson10.students;

class JuniorDeveloper extends Student {

    public JuniorDeveloper(String name) {
        super(name);
    }

    @Override
    void learnSomething() {
        System.out.println("Junior: So so");
    }

    void writeCode() {
        System.out.println("WOWOWO I'm writing code WOWO O.o ");
    }
}
