package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private final List<Point> points;

    public Line(int width) {
        points = new ArrayList<>();
        Random random = new Random();
        points.add(new Point(random.nextBoolean()));
        for (int i = 1; i < width; i++) {
            Point lastPoint = points.get(points.size() - 1);
            points.add(new Point(random.nextBoolean() && !lastPoint.isMovable()));
        }
    }

    public List<Point> getPoints() {
        return points;
    }

}
