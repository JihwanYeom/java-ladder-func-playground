package domain;

import java.util.List;

public class Player {
    int position;

    public Player (int position) {
        this.position = position;
    }

    public void down(Ladder ladder) {
        List<Line> lines = ladder.getLines();
        for(Line line : lines) {
            move(line);
        }
    }

    public void move(Line line) {
        List<Boolean> points = line.getPoints();
        if(position > 0 && points.get(position - 1)) {
            position--;
            return;
        }
        if(position < points.size() && points.get(position)) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
