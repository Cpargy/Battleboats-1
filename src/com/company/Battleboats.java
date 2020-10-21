package com.company;
import java.util.Scanner;

public class Battleboats {
    public int[][] boardSize;

    public Battleboats(int[][] initBoardSize) {
        this.boardSize = initBoardSize;
    }

    public static void main(String[] args) {
        System.out.println("Select Difficulty: Standard or Expert?");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        if (input.equals("Standard")) {
            Battleboats board = new Battleboats(new int[8][8]);
        } else if (input.equals("Expert")) {
            Battleboats board = new Battleboats(new int[12][12]);
        } else {
            System.out.println("Not a valid input");
        }
    }
}
