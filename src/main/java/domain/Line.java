package domain;

import java.util.List;

public class Line {

    private final List<Boolean> points;

    private Line(List<Boolean> points) {
        this.points = points;
    }

    public static Line of(List<Boolean> points) {
        return new Line(points);
    }

}
