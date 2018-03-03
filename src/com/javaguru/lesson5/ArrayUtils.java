package com.javaguru.lesson5;

import java.util.Random;

public class ArrayUtils {

    public static int[] createArray(int size) {
        return new int[size];
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

    public static int[][] createArray(int x, int y) {
        return new int[x][y];
    }

    public static void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
