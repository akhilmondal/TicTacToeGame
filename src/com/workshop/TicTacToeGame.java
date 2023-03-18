package com.workshop;

import java.util.Arrays;

public class TicTacToeGame {

    public void board() {
        char[] board = new char[11]; // create board of char[] of size 11
        Arrays.fill(board, 1, board.length, ' '); // assign empty space to each element starting from index 1
        // print the board to verify
        System.out.println(Arrays.toString(board));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TIC TAC TOE Game ");
        TicTacToeGame game = new TicTacToeGame();
        game.board();

    }
}
