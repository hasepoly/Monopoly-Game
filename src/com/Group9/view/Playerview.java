package com.Group9.view;

import com.Group9.GameConstants;
import com.Group9.model.Player;
import com.Group9.model.Propertysquare;

import java.util.List;

public class Playerview {
    private int numberofPlayers;
    private int RoundNumber;
    private Player player;

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


    public void createView(int playerNum, Player player){

    }



    public void displayPlayerView(int num, String Name, double Money, List<Propertysquare> playerProperty){

//        System.out.printf("%25s","Player Number");
//        System.out.printf("%30s","Player Name");
//        System.out.printf("%35s","Player Money");
//        System.out.printf("%40s","Player Owned Property");
//        System.out.println();


        System.out.printf("%d",num);
        System.out.printf("%35s",Name);
        System.out.printf("%30f",Money);
        System.out.printf("%40s",playerProperty);
        System.out.println();



    }
}
