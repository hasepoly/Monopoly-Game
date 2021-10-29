package com.Group9.view;

import com.Group9.GameConstants;
import com.Group9.model.Player;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewgameView {

    //Number of players in the game
    private static int numberOfPlayers;


    public static void runNewgameView() {

        boolean menurun=true;
        Scanner input = new Scanner(System.in);
        showNewgameView();
        int players;
        while(menurun){
            try {
                players = input.nextInt();
                if(validatenumberofPlayers(players)){
                    numberOfPlayers = players;
                    GameConstants.NUMBER_OF_PLAYERS = numberOfPlayers;
                    ArrayList<Player> newGamePlayers = createPlayers(numberOfPlayers);

                    //Boardview.displayGameBoard();
                    menurun = false;
                }
                else {
                    System.out.println("Invalid number of players. Please enter a number between 2 and 6");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid Input. Please enter a integer between 2 and 6");

            }
        }



    }


    public static void showNewgameView(){
        System.out.println("Enter the number of players (Between 2 and 6)");
    }

    // to check the right number of players have been added in the game
    public static boolean validatenumberofPlayers(int numofPlayers) {
        if(numofPlayers < 2 || numofPlayers > 6)
        {
            return false;
        }
        return true;

    }

    //Function to create players at the start. The user is asked to input player names.
    public static ArrayList<Player> createPlayers(int numofPlayers){
        ArrayList<Player>gamePlayer = new ArrayList<Player>(numofPlayers);
        Scanner input = new Scanner(System.in);

        for (int i = 0 ; i < numofPlayers; i++){
            System.out.println("Enter player" +i+1+ "name:");
            String playerName = input.nextLine();
            gamePlayer.add(new Player(playerName, 0,1,1500));

        }
        return gamePlayer;
    }



}
