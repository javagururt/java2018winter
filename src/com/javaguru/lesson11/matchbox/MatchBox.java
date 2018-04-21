package com.javaguru.lesson11.matchbox;

import java.util.ArrayList;
import java.util.List;

class MatchBox {

    public static final int MATCHBOX_CAPACITY = 10;

    private boolean opened;
    private List<Match> matches = new ArrayList<>();

    void open() throws MatchBoxException {
        if (opened) {
            throw new MatchBoxException("Already opened");
        }
        System.out.println("Opened");
        opened = true;
    }

    void close() throws MatchBoxException {
        if (!opened) {
            throw new MatchBoxException("Already closed");
        }
        System.out.println("Closed");
        opened = false;
    }

    Match getMatch() throws MatchBoxException {
        checkMatchBoxOpened();
        if (matches.size() == 0) {
            throw new MatchBoxException("Empty matchbox");
        }

        Match match = matches.get(0);
        matches.remove(0);
        return match;
    }

    void putMatch(Match match) throws MatchBoxException {
        checkMatchBoxOpened();
        //TODO: check NPE
        if (matches.size() >= MATCHBOX_CAPACITY) {
            throw new MatchBoxException("Matchbox is full");
        }
        matches.add(match);
        System.out.println("Match added");
    }

    int getMatchBoxSize() {
        return matches.size();
    }

    private void checkMatchBoxOpened() throws MatchBoxException {
        if (!opened) {
            throw new MatchBoxException("Open matchbox");
        }
    }
}
