package com.javaguru.lesson2;

import java.util.Scanner;

public class TernaryIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int userInput = scanner.nextInt();

        String result = userInput == 0 ? "ZERO" : "NOT ZERO";

        System.out.println(result);
    }
}
