package eu.jvandillen.hanabi.obj;

public class GameBoard {
    Deck deck;
    Discard discard;
    Hand[] hands;
    Stacks stacks;
    Hints hints;

    public GameBoard(String[] playersNames) {
        deck = new Deck();
        discard = new Discard();
        hands = new Hand[playersNames.length];
        stacks = new Stacks();
        hints = new Hints();
        for (int i = 0; i < playersNames.length; i++) {
            hands[i] = new Hand(deck,playersNames[i]);
        }
    }

    public Deck getDeck() {
        return deck;
    }

    public Discard getDiscard() {
        return discard;
    }

    public Hand[] getHands() {
        return hands;
    }

    public Stacks getStacks() {
        return stacks;
    }

    public Hints getHints() {
        return hints;
    }
}
