package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<Line> lines;

    public Ladder(int width, int height) {
        lines = new ArrayList<>();
        for(int i = 0; i < height; i++) {
            lines.add(new Line(width));
        }
    }

    public List<Line> getLines() {
        return lines;
    }

}
