package com.javaguru.lesson7.doors;

class DoorTest {

    public static void main(String[] args) {
        shouldSetColorBlack();
        doorsShouldBeEquals();
    }

    private static void shouldSetColorBlack() {
        Door door = new Door();
        door.setColor("Black");

        String expectedResult = "Black";
        String actualResult = door.getColor();

        assertEquals(expectedResult, actualResult);
    }

    private static void doorsShouldBeEquals() {
        Door firstDoor = new Door("Black",
                "Carbon",
                "50x50",
                "Philips");

        Door secondDoor = new Door("Black",
                "Carbon",
                "50x50",
                "Philips");

        if (firstDoor.equals(secondDoor)) {
            System.out.println("Success!");
        } else {
            System.err.println("Doors are different");
        }

    }

    private static void assertEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Success!");
        } else {
            System.err.println(String.format("Fail! Expected: %s, actual: %s", expectedResult, actualResult));
        }
    }
}
