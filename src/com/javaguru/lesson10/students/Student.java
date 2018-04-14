package com.javaguru.lesson10.students;

public class Student {

    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public void learnSomething() {
        System.out.println("Student: Learning processes");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
