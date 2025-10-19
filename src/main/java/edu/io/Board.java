package edu.io;

public class Board {
    private final int size = 8;
    private final Token[][] tokens = new Token[size][size];

    public void clean() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tokens[i][j] = new EmptyToken();
            }
        }
    }

    public void placeToken(int x, int y, Token token) {
        tokens[x][y] = token;
    }

    public Token square(int x, int y) {
        return tokens[x][y];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(tokens[i][j].getLabel() + " ");
            }
            System.out.println();
        }
    }

    public int getSize() { return size; }
}
