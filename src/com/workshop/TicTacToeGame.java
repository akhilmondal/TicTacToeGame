package com.workshop;

import java.util.Scanner;

public class TicTacToeGame {

    static char[][] gameBoard = {{' ', ' ', ' ', ' ', ' '}, //ignoring 0th index as
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '}};
    void printgameboard(char[][] gameboard) {

        for (char[] row : gameBoard) {
            for (char column : row){
                System.out.print("  " + column);
            }
            System.out.println("  ");
        }
    }
    void selectLetter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select any letter in between X or O: ");
        String letter = input.nextLine();
        System.out.println("selected letter is :  "+letter);
        if(letter.toLowerCase().equals("x")){
            System.out.println("and Computer will choose: O");
        } else if (letter.toLowerCase().equals("o")) {
            System.out.println("and Computer will choose: X");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TIC TAC TOE Game ");
        TicTacToeGame game = new TicTacToeGame();
        game.printgameboard(gameBoard);
        game.selectLetter();

    }

}
