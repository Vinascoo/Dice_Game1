package com.MATTEUS.tarningsspel;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //Variables
        String player1;
        String player2;
        int die = 0;
        int rounds = 5;
        int player1Sum = 0;
        int player2Sum = 0;
        //number of dice
        System.out.println("How many DICE do you want?");
        int numberOfDice = sc.nextInt();
        sc.nextLine();

        // player 1 name
        System.out.println("input player 1 name:");
        player1 = sc.nextLine();
        System.out.println("player 1: " + player1);
        //player2 name
        System.out.println("input player 2 name:");
        player2 = sc.nextLine();
        System.out.println("player 2: " + player2);

        //player 1 throw die
        System.out.println(player1 + ": Press `ENTER` to roll dice");
        sc.nextLine();
        System.out.println(player1 + " is throwing");
        for (int i = 1; i <= rounds; i++) {
            for (int j = 0; j < numberOfDice; j++) {
                die = random.nextInt(6) + 1;
                System.out.println(player1 + " rolled: " + die);
                player1Sum += die;
            }
            System.out.println("Round " + i + ", Score: " + player1Sum);
        }

        //player 2 throw loop
        System.out.println(player2 + ": Press `ENTER` to roll dice");
        sc.nextLine();
        System.out.println(player2 + " is throwing");
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < numberOfDice; j++) {
                die = random.nextInt(6) + 1;
                System.out.println(player2 + " rolled: " + die);
                player2Sum += die;
            }
            System.out.println("Round " + (i + 1) + ", Score: " + player2Sum);
        }

        System.out.println(player1 + " score: " + player1Sum);
        System.out.println(player2 + " score: " + player2Sum);
        //determine the winner
        if (player1Sum > player2Sum) {
            System.out.println(player1 + " Wins");
        } else if (player2Sum > player1Sum) {
            System.out.println(player2 + " Wins");
        } else {
            System.out.println("Draw");
        }
    }
}