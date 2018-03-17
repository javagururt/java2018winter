package com.javaguru.lesson7.marker;

class InkWritableInstrumentMain {

    public static void main(String[] args) {
        InkWritableInstrument marker = new Marker("Red", false, 100);

        write(marker);

        System.out.println("Marker: " + marker.getInkLevel());

        marker.refill();

        System.out.println("Marker:" + marker.getInkLevel());

        InkWritableInstrument pen = new Pen("Green", true, 100);

        write(pen);

        System.out.println("Pen: " + pen.getInkLevel());

        pen.refill();

        System.out.println("Pen: " + pen.getInkLevel());

        shouldRefillPen();
    }

    private static void shouldRefillPen() {
        InkWritableInstrument pen = new Pen("Green", true, 100);
        write(pen);
        pen.refill();
        if (pen.getInkLevel() == 90) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
    private static void write(InkWritableInstrument instrument) {
        for (int i = 0; i < 50; i++) {
            instrument.write();
        }
    }
}
