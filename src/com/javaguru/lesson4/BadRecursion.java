package com.javaguru.lesson4;

public class BadRecursion {

    public static void main(String[] args) {
        System.out.println(iterateFrom(0));
    }

    public static int iterateFrom(int number) {
        System.out.println(number);
        return iterateFrom(number + 1);
    }
}
