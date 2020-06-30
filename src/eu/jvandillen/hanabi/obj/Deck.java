package eu.jvandillen.hanabi.obj;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {

    LinkedList<Card> cards = new LinkedList<>();

    public Deck() {
        for (Color c : Color.values()) {
            for (int i = 1; i < 6; i++) {
                if (i == 1) {
                    cards.add(new Card(c, i));
                }
                cards.add(new Card(c, i));
                if (i != 5) {
                    cards.add(new Card(c, i));
                }
            }
        }

        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.pop();
    }
}
