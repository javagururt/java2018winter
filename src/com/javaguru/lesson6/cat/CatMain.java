package com.javaguru.lesson6.cat;

class CatMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Black");
        System.out.println(cat);
        changeColor(cat);
        System.out.println(cat);
    }

    public static void changeColor(Cat cat) {
//        cat.setColor("Red");
        Cat secondCat = cat;
        secondCat.setColor("Red");

    }
}
