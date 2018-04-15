package com.javaguru.lesson10.shapes;

class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
