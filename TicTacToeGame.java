package com.game;

public class TicTacToeGame {

    //constant variable
     static char[] board = new char[10];
    //main method
    public static void main(String[] args) {
        //calling method here
        creatingBoard();
    }
    //creating a method for main
    static void creatingBoard() {
        for(int i=0;i<10; i++) {
            board[i]='-';
        }
    }
}
