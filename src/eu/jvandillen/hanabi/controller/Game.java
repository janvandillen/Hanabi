package eu.jvandillen.hanabi.controller;

import eu.jvandillen.hanabi.obj.GameBoard;
import eu.jvandillen.hanabi.player.Player;
import eu.jvandillen.hanabi.printer.Printer;

import java.util.stream.Stream;

public class Game {
    GameBoard board;

    public Game(Printer printer, Player[] players) {

        String[] playerNames = Stream.of(players).map(Player::getName).toArray(String[]::new);
        board = new GameBoard(playerNames);
        printer.start();
        printer.printBoard(board);
    }
}
