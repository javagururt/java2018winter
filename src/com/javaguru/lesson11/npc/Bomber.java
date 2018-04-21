package com.javaguru.lesson11.npc;

class Bomber extends NPC implements Flyable, Attacker {

    private static final int HEALTH_POINTS = 100;

    public Bomber() {
        super(HEALTH_POINTS);
    }

    @Override
    public void attack() {
        System.out.println("BOOM");
    }

    @Override
    public void fly() {
        System.out.println("Bomber Fly...");
    }
}
