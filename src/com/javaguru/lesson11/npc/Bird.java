package com.javaguru.lesson11.npc;

class Bird extends NPC implements Flyable {

    private static final int HEALTH_POINTS = 10;

    public Bird() {
        super(HEALTH_POINTS);
    }

    @Override
    public void fly() {
        System.out.println("Bird Fly...");
    }
}
