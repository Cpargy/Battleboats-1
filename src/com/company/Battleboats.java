package com.company;
import java.util.Scanner;

public class Battleboats {
    public Cell[][] boardSize;
    public Cell[] boats;


    public Battleboats(Cell[][] initBoardSize,int numboats) {
        this.boardSize = initBoardSize;
        this.boats = new Cell[numboats];
        for(int row =0; row< this.boardSize.length; row++){
            for(int col=0; col <this.boardSize[row].length;col++){
                this.boardSize[row][col] = new Cell(row,col,'-');
            }
        }
    }
    public void print(Battleboats x) {
        for (int row = 0; row < x.boardSize.length; row++) {
            for (int col = 0; col < x.boardSize[row].length; col++) {
                System.out.print(x.boardSize[row][col].getStatus());
            }
            System.out.println("");
        }
    }
    public void placeboats(){
        if(boats.length == 5){
            Cell[][] boat1;
            boat1 = new Cell[5][2];
            Cell[][] boat2;
            boat2 = new Cell[4][2];
            Cell[][] boat3;
            boat3 = new Cell[3][2];
            Cell[][] boat4;
            boat4 = new Cell[3][2];
            Cell[][] boat5;
            boat5 = new Cell[2][2];
            Cell[][][] boats = {boat1,boat2,boat3,boat4,boat5};

        }
    }


    public static void main(String[] args) {
        System.out.println("Select Difficulty: Standard or Expert?");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        if (input.equals("Standard")) {
            Battleboats board = new Battleboats(new Cell[8][8],5);
            board.print(board);
        } else if (input.equals("Expert")) {
            Battleboats board = new Battleboats(new Cell[12][12],10);
            board.print(board);
        } else {
            System.out.println("Not a valid input");
        }
    }
}
