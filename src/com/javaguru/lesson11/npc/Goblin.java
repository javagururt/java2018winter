package com.javaguru.lesson11.npc;

class Goblin extends NPC implements Attacker {

    private static final int HEALTH_POINTS = 200;

    public Goblin() {
        super(HEALTH_POINTS);
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks!");
    }
}
