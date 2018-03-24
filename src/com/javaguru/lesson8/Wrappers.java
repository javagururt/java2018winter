package com.javaguru.lesson8;

class Wrappers {

    public static void main(String[] args) {
        Double doubleNumber = new Double(7.77);
        System.out.println(doubleNumber);
        System.out.println("Max double value: " + Double.MAX_VALUE);
        System.out.println("Min double value: " + Double.MIN_VALUE);

        Integer integerNumber = new Integer(15);
        System.out.println(integerNumber);
        System.out.println("Max integer value: " + Integer.MAX_VALUE);
        System.out.println("Min integer value: " + Integer.MIN_VALUE);

        Long longNumber = new Long(13);
        System.out.println(longNumber);
        System.out.println("Max long value: " + Long.MAX_VALUE);
        System.out.println("Min long value: " + Long.MIN_VALUE);
    }
}
