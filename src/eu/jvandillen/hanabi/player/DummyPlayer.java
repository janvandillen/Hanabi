package eu.jvandillen.hanabi.player;

public class DummyPlayer implements Player{
    String name;
    public DummyPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
