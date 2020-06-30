package eu.jvandillen.hanabi;

import eu.jvandillen.hanabi.controller.Game;
import eu.jvandillen.hanabi.player.DummyPlayer;
import eu.jvandillen.hanabi.player.Human;
import eu.jvandillen.hanabi.player.Player;
import eu.jvandillen.hanabi.printer.Printer;
import eu.jvandillen.hanabi.printer.Console;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        Player[] players = {new Human(console), new Human(console)};
        Game game = new Game(console, players);
    }
}
