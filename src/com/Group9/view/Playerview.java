package com.Group9.view;

import com.Group9.GameConstants;

public class Playerview {
    private int numberofPlayers;
    private int RoundNumber;

    public Playerview(){
        this.numberofPlayers = GameConstants.NUMBER_OF_PLAYERS;
    }

    public void setNumberofPlayers(int numberofPlayers) {
        this.numberofPlayers = numberofPlayers;
    }

    public void setRoundNumber(int roundNumber) {
        RoundNumber = roundNumber;
    }

    public int getNumberofPlayers() {
        return numberofPlayers;
    }

    public int getRoundNumber() {
        return RoundNumber;
    }

    public void displayPlayerView(){
        int counter = 0;

        System.out.printf("%s","Round Number:");
        System.out.printf("%25s","Player Number");
        System.out.printf("%30s","Player Name");
        System.out.printf("%35s","Player Money");
        System.out.printf("%40s","Player Owned Property");

//        while (counter < getNumberofPlayers()){
//
//            System.out.printf("%35s%d","Player:",getNumberofPlayers() - counter);
//            counter++;
//
//        }

    }
}
