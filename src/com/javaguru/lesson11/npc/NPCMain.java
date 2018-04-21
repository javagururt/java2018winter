package com.javaguru.lesson11.npc;

import java.util.ArrayList;
import java.util.List;

class NPCMain {

    public static void main(String[] args) {
        NPC goblin = new Goblin();
        NPC bomber = new Bomber();
        NPC bird = new Bird();

        List<NPC> npcs = new ArrayList<>();
        npcs.add(goblin);
        npcs.add(bird);
        npcs.add(bomber);

        List<Attacker> attackers = new ArrayList<>();
        List<Flyable> flyables = new ArrayList<>();
        for (NPC npc : npcs) {
            if (npc instanceof Attacker) {
                attackers.add((Attacker) npc);
            }
            if (npc instanceof Flyable) {
                flyables.add((Flyable) npc);
            }
        }

        flyables.forEach(flyable -> flyable.fly());

//        for(Attacker attacker : attackers) {
//            attacker.attack();
//        }
        attackers.forEach(attacker -> attacker.attack());
    }
}
