package com.javaguru.lesson5;

import java.util.Random;

public class CreateArrayExample {

    public static void main(String[] args) {
        int[] array = createArray(10);
        fillArrayWithRandomNumbers(array);
        printArray(array);
    }


    public static int[] createArray(int size) {
        int[] array = new int[size];
        return array;
        //return new int[size];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumberGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumberGenerator.nextInt(101);
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
