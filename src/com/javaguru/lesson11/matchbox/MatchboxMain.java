package com.javaguru.lesson11.matchbox;

class MatchboxMain {

    public static void main(String[] args) {
        MatchBox matchBox = new MatchBox();
        try {
            matchBox.open();

            matchBox.putMatch(null);

            for (int i = 0; i < MatchBox.MATCHBOX_CAPACITY; i++) {
                matchBox.putMatch(new Match());
            }

//            matchBox.close();

            Match match = matchBox.getMatch();
            match.burn();
            match.burn();


        } catch (MatchBoxException | BurnedMatchException e) {
            e.printStackTrace();
            System.out.println("Matchbox size: " + matchBox.getMatchBoxSize());
        } catch (MatchValidationException e) {
            System.out.println(e.getMessage());
        }

    }
}
