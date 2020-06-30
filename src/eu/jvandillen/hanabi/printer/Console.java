package eu.jvandillen.hanabi.printer;

import eu.jvandillen.hanabi.obj.GameBoard;
import eu.jvandillen.hanabi.obj.Hand;

import java.util.Scanner;

public class Console implements Printer,Input {

    Scanner sc = new Scanner(System.in);

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

    @Override
    public String askName(int nb) {
        System.out.println("You are player " + nb + ". What is your name");
        String name = sc.nextLine();
        return name;
    }
}
