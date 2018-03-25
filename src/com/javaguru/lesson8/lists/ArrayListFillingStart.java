package com.javaguru.lesson8.lists;

import java.util.ArrayList;
import java.util.List;

class ArrayListFillingStart {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            integers.add(0, i);
        }
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Filling ArrayList(end) with " + integers.size() + " elements, takes: " + result + " ms");

    }
}
