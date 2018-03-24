package com.javaguru.lesson8;

import java.util.ArrayList;
import java.util.List;

class Fridge {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct() {
        products.remove(1);
    }
}
