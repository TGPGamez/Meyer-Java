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
        DrawTurn();

    }


    public static void DrawTurn() {
        for (int i = 0; i < players.size(); i++) {
            if(i == game.getTurn())
                System.out.println(" -> " + players.get(i).getName());
            else
                System.out.println(" " + players.get(i).getName());
        }
        System.out.print(game.playerTurn(players.get(0)));
        System.out.println(game.LieOrTruth());
        cls();
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
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
}
