package com.javaguru.lesson2;

import java.util.Scanner;

public class AIfEqualsZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");

        int userInput = scanner.nextInt();

        if (userInput == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("NOT ZERO");
        }
    }
}
