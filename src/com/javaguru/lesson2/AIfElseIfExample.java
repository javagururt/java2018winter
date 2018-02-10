package com.javaguru.lesson2;

import java.util.Scanner;

public class AIfElseIfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int userInput = scanner.nextInt();

        if (userInput == 0) {
            System.out.println("ZERO");
        } else if (userInput > 10 ) {
            System.out.println("Your number > 10");
        } else {
            System.out.println("SOMETHING...");
        }
    }
}
