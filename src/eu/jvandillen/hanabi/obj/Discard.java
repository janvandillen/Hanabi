package eu.jvandillen.hanabi.obj;

public class Discard {
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Discard\n");
        for (Color c: Color.values()) {
            str.append(c.toString()).append(": ");
            str.append("\n");
        }
        return str.toString();
    }
}
