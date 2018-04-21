package com.javaguru.lesson11.matchbox;

class Match {

    private boolean burned;

    public boolean isBurned() {
        return burned;
    }

    public void burn() throws BurnedMatchException {
        if (burned) {
            throw new BurnedMatchException("Already burned");
        }
        burned = true;
    }
}
