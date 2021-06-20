package com.game;

import java.util.Scanner;

public class TicTacToeGame {
    //constant variable
    static char[] board = new char[10];
    static char player,computer;
    public static Scanner sc = new Scanner(System.in);
    //main method
    public static void main(String[] args) {
        //calling method here
        creatingBoard();
        //calling playerOption method
        playerChoice();
    }
    //creating a method for main
    static void creatingBoard() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }
    //creating method for choosing option
    static void playerChoice() {
        System.out.println("choose an option x or o");
         player = sc.next().charAt(0);
        if (player == 'x') {
            computer='o';
        } else {
            computer ='x';
        }
    }

}

