package eu.jvandillen.hanabi.printer;

public class ConsolePrinter implements Printer{
    @Override
    public void start() {
        System.out.print("Hello World");
    }
}
