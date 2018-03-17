package com.javaguru.lesson7.doors;

class DoorMain {

    public static void main(String[] args) {
        Door firstDoor = new Door("Black",
                "Carbon",
                "50x50",
                "Philips");

        Door secondDoor = new Door("Black",
                "Carbon",
                "50x50",
                "Philips");

        if (firstDoor.equals(secondDoor)) {
            System.out.println("Doors are equals");
        } else {
            System.out.println("Doors are different");
        }

    }
}
