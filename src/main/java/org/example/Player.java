package org.example;

public class Player {

    private final String name;

    private int money;

    public Player(String name, int initialMoney) {
        this.name = name;
        this.money = initialMoney;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void increaseMoney(int amount) {
        this.money += amount;
    }

    public void decreaseMoney(int amount) {
        this.money -= amount;
    }
}
