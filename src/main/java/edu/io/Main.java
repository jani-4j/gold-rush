package edu.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.clean();
        PlayerToken player = new PlayerToken(6, 1);
        board.placeToken(2, 4, new GoldToken());
        board.placeToken(player.getRow(), player.getCol(), player);
        board.display();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj kierunek ruchu (UP, DOWN, LEFT, RIGHT, NONE):");
            String input = scanner.nextLine().trim().toUpperCase();
            try {
                Move move = Move.valueOf(input);
                board.placeToken(player.getRow(), player.getCol(), new EmptyToken());
                player.move(move, board.getSize());
                board.placeToken(player.getRow(), player.getCol(), player);
                board.display();
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
    }
}
