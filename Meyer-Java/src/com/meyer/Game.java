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
        if(turn < players.size() - 1) {
            this.turn = value;
        }
        else {
            this.turn = 0;
        }
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

    public String lieOrTruth() {
        Scanner input = new Scanner(System.in);
        String inputed = input.nextLine();
        return inputed;
    }

    public String answerLieOrTruth() {
        Scanner input = new Scanner(System.in);
        int inputed = input.nextInt();
        switch (inputed) {
            case 1:
                return "Choosed 1";
            case 2:
                return "Choosed 2";
            default:
                break;
        }
        return "Error";
    }
}
