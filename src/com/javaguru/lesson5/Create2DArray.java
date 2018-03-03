package com.javaguru.lesson5;

import java.util.Random;

public class Create2DArray {

    public static void main(String[] args) {
        int[][] array = create2DArray(5, 10);
        fillArray(array);
        printArray(array);
    }

    public static int[][] create2DArray(int x, int y) {
        return new int[x][y];
    }

    public static void fillArray(int[][] array) {
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
