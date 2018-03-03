package com.javaguru.lesson5;

public class ArrayUtilsUsage {

    private static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(ARRAY_SIZE);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArray(array);

        System.out.println();
        System.out.println();

        int[][] twoDimArray = ArrayUtils.createArray(ARRAY_SIZE, ARRAY_SIZE);
        ArrayUtils.fillArrayWithRandomNumbers(twoDimArray);
        ArrayUtils.printArray(twoDimArray);
    }
}
