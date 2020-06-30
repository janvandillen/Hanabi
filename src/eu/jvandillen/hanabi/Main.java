package eu.jvandillen.hanabi;

import eu.jvandillen.hanabi.controller.Game;
import eu.jvandillen.hanabi.player.DummyPlayer;
import eu.jvandillen.hanabi.player.Player;
import eu.jvandillen.hanabi.printer.Printer;
import eu.jvandillen.hanabi.printer.ConsolePrinter;

public class Main {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Player[] players = {new DummyPlayer("Dumdum1"), new DummyPlayer("Dumdum2")};
        Game game = new Game(printer, players);
    }
}
