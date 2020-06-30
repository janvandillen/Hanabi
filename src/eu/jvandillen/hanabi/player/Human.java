package eu.jvandillen.hanabi.player;

import eu.jvandillen.hanabi.printer.Console;
import eu.jvandillen.hanabi.printer.Input;

public class Human implements Player {

    static int nb= 1;
    String name;

    public Human(Input input) {
        name = input.askName(nb);
        nb++;
    }

    @Override
    public String getName() {
        return name;
    }
}
