package com.javaguru.lesson2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Enter number: ");

        int userInput = getNumberFromUser();

        String result = isEven(userInput) ? "Even" : "Odd";

        System.out.println(result);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
