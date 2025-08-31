// src/Player.java
public abstract class Player {
    protected char mark;

    public Player(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }

    public abstract void makeMove(Board board);
}
