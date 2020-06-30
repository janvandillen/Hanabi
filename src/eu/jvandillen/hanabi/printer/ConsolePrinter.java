package eu.jvandillen.hanabi.printer;

import eu.jvandillen.hanabi.obj.GameBoard;
import eu.jvandillen.hanabi.obj.Hand;

public class ConsolePrinter implements Printer {
    @Override
    public void start() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Welcome to Hannabi");
        System.out.println();
    }

    @Override
    public void printBoard(GameBoard board) {
        start();
        System.out.println(board.getHints().toString());
        for (Hand hand : board.getHands()) {
            System.out.println(hand.toString());
        }
        System.out.println();
        System.out.println(board.getStacks().toString());
        System.out.println();
        System.out.println(board.getDiscard().toString());
    }

}
