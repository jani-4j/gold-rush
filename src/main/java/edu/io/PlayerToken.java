package edu.io;

public class PlayerToken extends Token {
    private int row, col;
    public PlayerToken(int row, int col) {
        super("웃");
        this.row = row;
        this.col = col;
    }
    public void move(Move dir, int boardSize) {
        int newRow = row, newCol = col;
        switch (dir) {
            case UP: newRow--; break;
            case DOWN: newRow++; break;
            case LEFT: newCol--; break;
            case RIGHT: newCol++; break;
            default: break;
        }
        // Sprawdzenie granic planszy
        if (newRow < 0 || newRow >= boardSize || newCol < 0 || newCol >= boardSize) {
            throw new IllegalArgumentException("Ruch poza planszę!");
        }
        row = newRow;
        col = newCol;
    }
    public int getRow() { return row; }
    public int getCol() { return col; }
}
