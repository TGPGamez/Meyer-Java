package com.meyer;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan;
    private static List<Player> players;
    private static Game game;

    public static void main(String[] args) {
        game = new Game(startUpPlayerAmount());
        players = game.getPlayers();
        while(!game.getDone()) {
            DrawTurn();
        }
    }


    public static void DrawTurn() {
        for (int i = 0; i < players.size(); i++) {
            if(i == game.getTurn())
                System.out.println(" -> " + players.get(i).getName() + ": " + players.get(i).getLives() + " lives");
            else
                System.out.println(" " + players.get(i).getName() + ": " + players.get(i).getLives() + " lives");
        }
        System.out.print(game.playerTurn(players.get(game.getTurn())));
        System.out.println(game.lieOrTruth());
        game.setTurn(game.getTurn() + 1);
        System.out.println(trustPlayer());
    }


    private static String[] startUpPlayerAmount(){
        System.out.print("How many people will be playing (2-8)? ");
        scan = new Scanner(System.in);
        try {
            int amount = scan.nextInt();
            return startUpCreatePlayers(amount);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static String[] startUpCreatePlayers(int amount) {
        String[] players = new String[amount];
        for (int i = 0; i < players.length; i++) {
            System.out.print("\nType player " + (i + 1) + " name: ");
            scan = new Scanner(System.in);
            String typedPlayer = scan.nextLine();
            players[i] = typedPlayer;
        }
        return players;
    }

    private static String trustPlayer() {
        System.out.println("Du har følgende muligheder:");
        System.out.println(" 1. " + players.get(game.getTurn() - 1).getName() + " lyver / passer ikke");
        System.out.println(" 2. " + players.get(game.getTurn() - 1).getName() + " taler sandt");
        System.out.print("Indtast valgte mulighed: ");
        return game.answerLieOrTruth();
    }
}
