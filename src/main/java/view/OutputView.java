package view;

import domain.Ladder;
import domain.Line;
import domain.Player;
import java.util.List;

public class OutputView {

    private static final String LADDER_POINT = "-----";
    private static final String NO_LADDER_POINT = "     ";

    public static void printLadder(Ladder ladder) {
        System.out.println("실행 결과");
        List<Line> lines = ladder.getLines();
        for(Line line : lines) {
            printLine(line);
        }
    }

    private static void printLine(Line line) {
        List<Boolean> points = line.getPoints();
        for(Boolean point : points) {
            System.out.print("|");
            System.out.print(getPointFormat(point));
        }
        System.out.println("|");
    }

    public static void printResult(List<Player> players) {
        for(int i = 0; i < players.size(); i++) {
            System.out.println(i + " -> " + players.get(i).getPosition());
        }
    }

    private static String getPointFormat(Boolean point) {
        if(point) return LADDER_POINT;
        return NO_LADDER_POINT;
    }
}
