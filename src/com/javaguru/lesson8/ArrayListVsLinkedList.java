package com.javaguru.lesson8;

import java.util.LinkedList;
import java.util.List;

class ArrayListVsLinkedList {

    public static void main(String[] args) {
//        int - Integer;
//        double - Double;
//        char - Character;
//        short - Short;
//        long - Long;
//        byte - Byte;
//        float - Float;

        List<Integer> integers = new LinkedList<>();
//                new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            integers.add(0, i);
        }

        long stop = System.currentTimeMillis();

        long result = stop - start;

        System.out.println(result + " ms");

//        System.out.println(integers.get(10));

        System.out.println("Done!" + integers.size() + " elements added");
    }
}
