package com.javaguru.lesson4;

public class Recursion {

    public static void main(String[] args) {
        int result = sum(1, 4);
        System.out.println(result);
    }

    public static int sum(int from, int to) {
        if (from < to) {
            return from + sum(from +1, to);
        }
        return from;
    }
}
