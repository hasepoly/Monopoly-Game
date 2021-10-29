package com.Group9.model;

import java.util.Random;

public class ChanceSquare {
    private int chance; // value 1 means gain money , value -1 means lose money
    private int lossAmount;
    private int gainAmount;

    // create chance weather gain or lose money
    public void createChance(){
        double chancetype = Math.random();
        if(chancetype > 0.5){
            setChance(1);
        }
        else{
            setChance(-1);
        }
    }
    //Calculate amount based on the chance type
    public void calculateAmount(){
        if (chance == 1) {
            calculateGainAmount(); // Calculate the random amount gained by the player
        }
        else{
            calculateLossAmount(); // calculate the random amount lost by the player
        }

    }
    // method to calculate the amount to be gained
    public void calculateGainAmount(){
        Random rand = new Random();
        int amount = rand.nextInt(201);
        // check the random amount is a multiple of 10
        while(amount % 10 != 0) {
            amount = rand.nextInt(201);
        }
        setGainAmount(amount);
    }
    // method to calculate the amount to be lost
    public void calculateLossAmount(){
        Random rand = new Random();
        int amount = rand.nextInt(300);
        // check the random amount is a multiple of 10
        while(amount % 10 != 0) {
            amount = rand.nextInt(201);
        }
        setLossAmount(amount);
    }


    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getLossAmount() {
        return lossAmount;
    }

    public void setLossAmount(int lossAmount) {
        this.lossAmount = lossAmount;
    }

    public int getGainAmount() {
        return gainAmount;
    }

    public void setGainAmount(int gainAmount) {
        this.gainAmount = gainAmount;
    }
}
