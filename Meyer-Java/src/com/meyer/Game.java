package com.meyer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players;
    public List<Player> getPlayers() {
        return players;
    }

    public Game(String[] playersArray) {
        players = MakePlayers(playersArray);
    }

    private List<Player> MakePlayers(String[] playersArray) {
        List<Player> returnPlayers = new ArrayList<>();
        for (int i = 0; i < playersArray.length; i++) {
            returnPlayers.add(new Player(playersArray[i]));
        }
        return returnPlayers;
    }
}
