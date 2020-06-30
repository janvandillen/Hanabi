package eu.jvandillen.hanabi.obj;

import java.util.LinkedList;

public class Hand {
    LinkedList<Card> cards;
    String playerName;

    public Hand(Deck deck, String playerName) {
        this.playerName = playerName;
        cards = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cards.add(deck.draw());
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(playerName).append(": ");
        for (Card card : cards) {
            str.append(card.toString()).append(" ");
        }
        return str.toString();
    }
}
