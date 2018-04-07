package com.javaguru.lesson9.set;

import java.util.*;

class SetExample {

    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(new StringReverseOrderComparator());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            strings.add(userInput);
        }

//        strings.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

        System.out.println(strings);
    }
}
