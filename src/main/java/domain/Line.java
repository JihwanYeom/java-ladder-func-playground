package domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private final List<Point> points;

    public Line(int width) {
        points = new ArrayList<>();

        points.add(new Point(PointState.randomState()));
        for (int i = 1; i < width; i++) {
            PointState newState = generateNextState(i);
            points.add(new Point(newState));
        }
    }

    private PointState generateNextState(int index) {
        Point lastPoint = points.get(index - 1);
        if (lastPoint.isMovable()) {
            return PointState.NOT_MOVABLE;
        }
        return PointState.randomState();
    }

    public List<Point> getPoints() {
        return points;
    }
}
