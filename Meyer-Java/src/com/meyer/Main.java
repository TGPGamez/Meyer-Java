package com.meyer;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startUpPlayerAmount();
    }

    private static void startUpPlayerAmount(){
        System.out.print("How many people will be playing (2-8)? ");
        Scanner scanAmount = new Scanner(System.in);
        try {
            int amount = scanAmount.nextInt();
            startUpCreatePlayers(amount);
        } catch (NumberFormatException ex) {

        }
    }

    private static void startUpCreatePlayers(int amount) {
        String[] players = new String[amount];
        for (int i = 0; i < players.length; i++) {
            System.out.print("\nType player " + (i + 1) + " name: ");
            Scanner check = new Scanner(System.in);
            String player = check.nextLine();
            players[i] = player;
        }
    }
}
