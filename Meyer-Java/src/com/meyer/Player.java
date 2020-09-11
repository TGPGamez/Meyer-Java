package com.meyer;

public class Player {

    private String name;
    public void setName(String playerName) {
        this.name = playerName;
    }
    public String getName() {
        return name;
    }

    public Player(String playerName) {
        setName(playerName);
    }
}
