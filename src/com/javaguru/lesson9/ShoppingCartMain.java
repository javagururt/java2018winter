package com.javaguru.lesson9;

import java.math.BigDecimal;

class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product apple = new Product("Apple", BigDecimal.ONE,
                ProductType.FRUIT, 321412);

        Product vodka = new Product("Nemiroff", BigDecimal.ZERO,
                ProductType.ALCOHOL, 921381234);

        BigDecimal meatPrice = new BigDecimal(12.3)
                .setScale(2, BigDecimal.ROUND_HALF_UP);

        Product meat = new Product("Chicken", meatPrice,
                ProductType.MEAT, 124124);

        cart.add(apple);
        cart.add(vodka);
        cart.add(meat);

        System.out.println(cart.getProduct(321412));
        System.out.println(cart.getProduct(921381234));
        System.out.println(cart.getProduct(124124));


        System.out.println();

        cart.showProducts();
    }
}
