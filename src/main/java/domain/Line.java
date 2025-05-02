package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private final List<Point> points;

    public Line(int width) {
        points = new ArrayList<>();
        Random random = new Random();

        points.add(new Point(generateRandomState(random)));
        for (int i = 1; i < width; i++) {
            PointState newState = generateNextState(i, random);
            points.add(new Point(newState));
        }
    }

    private PointState generateNextState(int index, Random random) {
        Point lastPoint = points.get(index - 1);
        if (lastPoint.isMovable()) {
            return PointState.NOT_MOVABLE;
        } else {
            return generateRandomState(random);
        }
    }

    private PointState generateRandomState(Random random) {
        if (random.nextBoolean()) {
            return PointState.MOVABLE;
        } else {
            return PointState.NOT_MOVABLE;
        }
    }

    public List<Point> getPoints() {
        return points;
    }
}
