package com.javaguru.lesson8;

import java.util.ArrayList;
import java.util.List;

class FridgeMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            products.add(new Product());
        }

        System.out.println(products.size());

        System.out.println(products.get(500));
    }
}
