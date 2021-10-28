package com.Group9.model;

public class Player {
    private String name;
    private String money;
    private int token;
    private double startingSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
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
                ", money='" + money + '\'' +
                ", token=" + token +
                ", startingSalary=" + startingSalary +
                '}';
    }
}
