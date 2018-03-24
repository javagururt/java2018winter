package com.javaguru.lesson8.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OperationsWithList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Get from list: " + strings.get(2));
        System.out.println("Size: " + strings.size());
        System.out.println("List: " + strings);
        System.out.println("Removed A: " + strings.remove("A"));
        System.out.println("List: " + strings);
        System.out.println("Removed string at 0 index: " + strings.remove(0));
        System.out.println("List: " + strings);
    }
}
