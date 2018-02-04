package com.javaguru.lesson1;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        int sumResult = firstNumber + secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int subtractResult = firstNumber - secondNumber;
        double divideResult = (double) firstNumber / (double) secondNumber;

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("Divide: " + divideResult);
    }
}
