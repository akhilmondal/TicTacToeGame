package com.workshop;

import java.util.Arrays;

public class TicTacToeGame {

    static char[][] gameBoard = {{' ', ' ', ' ', ' ', ' '}, //ignoring 0th index as
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '}};
    public static void printgameboard(char[][] gameboard) {

        for (char[] row : gameBoard) {
            for (char column : row){
                System.out.print("  " + column);
            }
            System.out.println("  ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TIC TAC TOE Game ");
        TicTacToeGame game = new TicTacToeGame();
        printgameboard(gameBoard);

    }

}
