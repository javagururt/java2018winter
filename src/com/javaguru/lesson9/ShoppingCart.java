package com.javaguru.lesson9;

import java.util.HashMap;
import java.util.Map;

class ShoppingCart {

    private Map<Integer, Product> products = new HashMap<>();

    void add(Product product) {
        products.put(product.getBarCode(), product);
    }

    Product getProduct(Integer barCode) {
        return products.get(barCode);
    }

    void showProducts() {
        System.out.println(products);
    }
}
