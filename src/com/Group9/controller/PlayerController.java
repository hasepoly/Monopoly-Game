package com.Group9.controller;

import com.Group9.model.Dice;
import com.Group9.model.Player;
import com.Group9.view.Boardview;
import com.Group9.view.Playerview;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerController {

    private ArrayList<Player> players;
    private Playerview playerview;
    private int Round;

    public PlayerController(ArrayList<Player> players, Playerview playerview, int round) {
        this.players = players;
        this.playerview = playerview;
        Round = round;
    }

    public int getRound() {
        return Round;
    }

    public void setRound(int round) {
        Round = round;
    }

    public void displayBoardView(int Round){
        Boardview boardview = new Boardview();
        boardview.displayGameBoard(Round);
    }


    public void displayUpdatedPlayerView() {
        for (int playernumber = 0; playernumber < players.size(); playernumber++) {
            playerview.displayPlayerView(
                    playernumber+1,
                    players.get(playernumber).getName(),
                    players.get(playernumber).getMoney(),
                    players.get(playernumber).getProperty()
            );
        }

    }

    public boolean startRound(){
        boolean IsRoundQuit = false;
        Scanner input = new Scanner(System.in);
        Dice Dice1 = new Dice();
        Dice Dice2 = new Dice();
        String choice;
        boolean choiceaction= true;
        for (int playerNumber = 0; playerNumber< players.size(); playerNumber++)
        {
            System.out.printf("%s%d%s%s","Player",playerNumber+1,players.get(playerNumber).getName()," Press R to roll Dice or X to quit the round");
            choice = input.nextLine().trim();

            while(choiceaction){
                switch (choice) {
                    case "R":
                    case "r":
                        //start rolling
                        //choiceaction = false;
                        break;
                    case "X":
                    case "x":
                        //Quit the round
                        choiceaction = false;
                        IsRoundQuit = true;
                        break;
                    default:
                        System.out.println("Invalid Choice. Press R to roll Dice or X to Quit the round");
                        input.nextLine();
                        choice = input.nextLine().trim();
                }
            }

            // condition for breaking the for loop which runs the turns of each round.
            if (choice.equals("X") || choice.equals("x")){
                System.out.println("The round has been ended. Going back to main menu");
                break;
            }

        }

        return IsRoundQuit;


    }





}
