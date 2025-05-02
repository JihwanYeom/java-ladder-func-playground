package domain;

public class Position {
    private int position;
    public Position(int position) {
        this.position = position;
    }

    public void moveLeft() {
        position--;
    }

    public void moveRight() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
