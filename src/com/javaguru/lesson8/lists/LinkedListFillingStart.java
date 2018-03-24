package com.javaguru.lesson8.lists;

import java.util.LinkedList;
import java.util.List;

class LinkedListFillingStart {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            integers.add(0, i);
        }
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Filling LinkedList(end) with " + integers.size() + " elements, takes: " + result + " ms");
    }
}
