package eu.jvandillen.hanabi.printer;

import eu.jvandillen.hanabi.obj.GameBoard;

public interface Printer {
    void start();

    void printBoard(GameBoard board);
}
