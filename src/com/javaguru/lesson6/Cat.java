package com.javaguru.lesson6;

class Cat {

    private String color;

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
