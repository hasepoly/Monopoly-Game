package com.Group9.model;

import java.util.List;

public class Player {
    private String name;
    private double money;
    private int token;
    private double startingSalary;
    private List<Propertysquare> property;

    public Player(String name, double money, int token, double startingSalary) {
        this.name = name;
        this.money = money;
        this.token = token;
        this.startingSalary = startingSalary;
    }

    public List<Propertysquare> getProperty() {
        return property;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public double getStartingSalary() {
        return startingSalary;
    }

    public void setStartingSalary(double startingSalary) {
        this.startingSalary = startingSalary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", token=" + token +
                ", startingSalary=" + startingSalary +
                '}';
    }
}
