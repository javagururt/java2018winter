package com.javaguru.lesson11.npc;
//NPC non-playable character
abstract class NPC {

    private int healthPoints;

    public NPC(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
