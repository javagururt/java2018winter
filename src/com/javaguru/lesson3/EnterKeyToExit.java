package com.javaguru.lesson3;

import java.util.Scanner;

public class EnterKeyToExit {

    public static void main(String[] args) {
        String key = "password123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter key: ");
            String userInput = scanner.nextLine();

            if (key.equals(userInput)) {
                System.out.println("Success!");
                break;
            }
        }
    }
}
