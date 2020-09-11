package com.meyer;

import java.util.Random;

public class Player {

    private String name;
    public void setName(String playerName) {
        this.name = playerName;
    }
    public String getName() {
        return name;
    }

    private int lives;
    public int getLives() {
        return lives;
    }

    private int cube1;
    public int getCube1() {
        return cube1;
    }
    public void setCube1(int value) { this.cube1 = value; }
    private int cube2;
    public int getCube2() {
        return cube2;
    }
    public void setCube2(int value) { this.cube2 = value; }

    public Player(String playerName) {
        setName(playerName);
        lives = 6;
    }

    private Random random;
    protected int getNewValue() {
        random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
    }
}
