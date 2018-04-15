package com.javaguru.lesson10.shapes;

import java.util.Arrays;
import java.util.List;

class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(12.3, 14.2);

        List<Shape> shapes = Arrays.asList(circle, square, rectangle);

        shapes.forEach(shape -> System.out.println(shape.getArea()));
    }
}
