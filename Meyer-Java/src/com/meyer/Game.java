package com.meyer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players;
    public List<Player> getPlayers() {
        return players;
    }
    private boolean isDone;
    public boolean getDone() {
        return isDone;
    }

    private int turn;
    public int getTurn() {
        return turn;
    }
    public void setTurn(int value) {
        this.turn = value;
    }

    public Game(String[] playersArray) {
        players = MakePlayers(playersArray);
        isDone = false;
        setTurn(0);
    }



    private List<Player> MakePlayers(String[] playersArray) {
        List<Player> returnPlayers = new ArrayList<>();
        for (int i = 0; i < playersArray.length; i++) {
            returnPlayers.add(new Player(playersArray[i]));
        }
        return returnPlayers;
    }

    public String playerTurn(Player player) {
        player.setCube1(player.getNewValue());
        player.setCube2(player.getNewValue());
        return "\nDu slog: "
                + player.getCube1()
                + " & "
                + player.getCube2()
                + "\nSkriv hvad du \"slog\": ";
    }

    public String LieOrTruth() {
        Scanner input = new Scanner(System.in);
        try {
            int inputedInt = input.nextInt();
            return "2";
        } catch (NumberFormatException ex) {
            return "Du skal skrive et tal";
        }
    }

}
