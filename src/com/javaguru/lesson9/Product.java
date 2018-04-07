package com.javaguru.lesson9;

import java.math.BigDecimal;

class Product {

    private String name;
    private BigDecimal price;
    private ProductType type;
    private Integer barCode;

    Product(String name, BigDecimal price, ProductType type, Integer barCode) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public Integer getBarCode() {
        return barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", barCode=" + barCode +
                '}';
    }
}
