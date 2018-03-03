package com.javaguru.lesson5;

public class ArrayUtilsUsage {

    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(10);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArray(array);

        System.out.println();
        System.out.println();

        int[][] twoDimArray = ArrayUtils.createArray(5,5);
        ArrayUtils.fillArrayWithRandomNumbers(twoDimArray);
        ArrayUtils.printArray(twoDimArray);
    }
}
