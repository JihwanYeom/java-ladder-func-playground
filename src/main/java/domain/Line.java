package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private final List<Boolean> points;

    public Line(int width) {
        points = new ArrayList<Boolean>();
        Random random = new Random();
        points.add(random.nextBoolean());
        for (int i = 1; i < width; i++) {
            points.add(random.nextBoolean() && !points.get(points.size() - 1));
        }
    }

}
