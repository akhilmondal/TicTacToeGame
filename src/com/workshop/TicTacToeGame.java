package com.workshop;

import java.util.Scanner;

public class TicTacToeGame {

    static char[][] gameBoard = {{' ', ' ', ' ', ' ', ' '}, //ignoring 0th index as
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '}};

    char selectLetter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select any letter in between X or O: ");
        char letter = input.next().charAt(0);
        System.out.println("selected letter is :  " + letter);
        return letter;
    }

    static void printgameboard(char[][] gameboard) {

        for (char[] row : gameBoard) {
            for (char column : row) {
                System.out.print("  " + column);
            }
            System.out.println("  ");
        }
    }

    static void playerMove(char[][] gameboard, int position, String player, char letter) {

        switch (position) {
            case 1:
                if (gameboard[0][0] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[0][0] = letter;
                }
                break;
            case 2:
                if (gameboard[0][2] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[0][2] = letter;
                }
                break;
            case 3:
                if (gameboard[0][4] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[0][4] = letter;
                }
                break;
            case 4:
                if (gameboard[2][0] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[2][0] = letter;
                }
                break;
            case 5:
                if (gameboard[2][2] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[2][2] = letter;
                }
                break;
            case 6:
                if (gameboard[2][4] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[2][4] = letter;
                }
                break;
            case 7:
                if (gameboard[4][0] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[4][0] = letter;
                }
                break;
            case 8:
                if (gameboard[4][2] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[4][2] = letter;
                }
                break;
            case 9:
                if (gameboard[4][4] != ' ') {
                    System.out.println("The chosen index is not empty");
                } else {
                    gameboard[4][4] = letter;
                }
                break;
            default:
                break;
        }
        printgameboard(gameboard);
    }
    static void checkFreeSpace(char[][] gameboard) {
        for (int i = 1; i<= 9; i++) {
            switch (i) {
                case 1:
                    if (gameboard[0][0] != ' ') {
                        System.out.println("The 1st index is not empty: ");
                    } else {
                        System.out.println("The 1st index is empty: ");
                    }
                    break;
                case 2:
                    if (gameboard[0][2] != ' ') {
                        System.out.println("The 2nd index is not empty: ");
                    } else {
                        System.out.println("The 2nd index is empty: ");
                    }
                    break;
                case 3:
                    if (gameboard[0][4] != ' ') {
                        System.out.println("The 3rd index is not empty: ");
                    } else {
                        System.out.println("The 3rd index is empty: ");
                    }
                    break;
                case 4:
                    if (gameboard[2][0] != ' ') {
                        System.out.println("The 4th index is not empty: ");
                    } else {
                        System.out.println("The 4th index is empty: ");
                    }
                    break;
                case 5:
                    if (gameboard[2][2] != ' ') {
                        System.out.println("The 5th index is not empty: ");
                    } else {
                        System.out.println("The 5th index is empty: ");
                    }
                    break;
                case 6:
                    if (gameboard[2][4] != ' ') {
                        System.out.println("The 6th index is not empty: ");
                    } else {
                        System.out.println("The 6th index is empty: ");
                    }
                    break;
                case 7:
                    if (gameboard[4][0] != ' ') {
                        System.out.println("The 7th index is not empty: ");
                    } else {
                        System.out.println("The 7th index is empty: ");
                    }
                    break;
                case 8:
                    if (gameboard[4][2] != ' ') {
                        System.out.println("The 8th index is not empty: ");
                    } else {
                        System.out.println("The 8th index is empty: ");
                    }
                    break;
                case 9:
                    if (gameboard[4][4] != ' ') {
                        System.out.println("The 9th index is not empty: ");
                    } else {
                        System.out.println("The 9th index is empty: ");
                    }
                    break;
                default:
                    break;
            }
        }
        printgameboard(gameboard);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TIC TAC TOE Game ");
        TicTacToeGame game = new TicTacToeGame();
        printgameboard(gameBoard);
        char letter = game.selectLetter();
        System.out.println("Enter your selected position from 1 to 9 for gameboard ");
        Scanner select = new Scanner(System.in);
        int position = select.nextInt();
        playerMove(gameBoard, position, "Akhil", letter);
        checkFreeSpace(gameBoard);
    }

}
