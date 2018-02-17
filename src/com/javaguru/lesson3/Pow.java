package com.javaguru.lesson3;

import java.util.Scanner;

public class Pow {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int userNumber = getNumberFromUser();
        System.out.println("Enter power: ");
        int pow = getNumberFromUser();
        int result = pow(userNumber, pow);

        System.out.println("Result: " + result);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int pow(int number, int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = number;
        for (int i = 1; i < pow; i++) {
            result = number * result;
        }
        return result;
    }
}
