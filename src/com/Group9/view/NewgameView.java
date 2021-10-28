package com.Group9.view;

import com.Group9.GameConstants;

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



}
