package com.javaguru.lesson1;


import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        System.out.println("Hello, please enter number: ");
        // comment
        /*

         comment

         */

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("User input = " + userInput);
    }
}
