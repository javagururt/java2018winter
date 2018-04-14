package com.javaguru.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

class StreamExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0, j = 65; i < 25 && j < 90; i++, j++) {
            char c = (char) j;
            strings.add(String.valueOf(c));
        }

//        for(String str : strings) {
//            if (str.equals("M")) {
//                continue;
//            }
//            System.out.println(str);
//        }

        String lowerCase = strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.joining(","));

        System.out.println(lowerCase);


        List<String> names = new ArrayList<>();

        names.add("Ruslan");
        names.add("Ruslan");
        names.add("Vasya");
        names.add("Vasya");
        names.add("Oleg");
        names.add("Oleg");
        names.add("Oleg");

        System.out.println();

        names.forEach(System.out::println);

        System.out.println();

        Set<String> uqNames = names.stream()
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());

        uqNames.forEach(System.out::println);

        System.out.println();
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(101);
            integers.add(randomNumber);
        }

        int sum = integers.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

    }
}
