package com.javaguru.lesson3;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        int firstNumber = getNumberFromUser();
        int secondNumber = getNumberFromUser();

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
