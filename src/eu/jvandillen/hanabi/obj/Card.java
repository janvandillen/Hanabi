package eu.jvandillen.hanabi.obj;

public class Card {
    Color color;
    int value;
    public Card(Color c, int i) {
        color = c;
        value = i;
    }

    @Override
    public String toString() {
        return (color.toString().charAt(0) + Integer.toString(value));
    }
}
