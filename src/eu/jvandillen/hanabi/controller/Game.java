package eu.jvandillen.hanabi.controller;

import eu.jvandillen.hanabi.player.Player;
import eu.jvandillen.hanabi.printer.Printer;

public class Game {
    public Game(Printer printer, Player[] players) {
        printer.start();
    }
}
