package com.javaguru.lesson2;

import java.util.Scanner;

public class IfIfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int userInput = scanner.nextInt();

        if (userInput == 5) {
            System.out.println("FIVE");
            return;
        }

        if (userInput > 0) {
            System.out.println("More than zero");
            return;
        }
    }
}
