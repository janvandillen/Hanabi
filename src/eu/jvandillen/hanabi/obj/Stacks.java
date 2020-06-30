package eu.jvandillen.hanabi.obj;

import java.util.HashMap;
import java.util.Map;

public class Stacks {

    Map<Color, Card> tops = new HashMap<>();

    public Stacks() {
        for (Color c : Color.values()) {
            tops.put(c,null);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Stacks: ");
        for (Color c: Color.values()) {
            Card card = tops.get(c);
            if (card == null) {
                str.append(c.toString().charAt(0)).append("0 ");
            }
            else {
                str.append(card.toString());
            }
        }
        return str.toString();
    }
}
