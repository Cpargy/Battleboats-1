package com.company;

public class Cell {
    public int row;
    public int col;
    public char status;

    public Cell(int row, int col, char status) {
        this.row = row;
        this.col = col;
        this.status = status;
    }

    public char getStatus() {
        return this.status;
    }

    public void set_status(char c) {
        this.status = c;
    }
}
