package view;

import domain.Ladder;
import domain.Line;
import domain.Player;
import java.util.List;

public class OutputView {

    private static final String LADDER_POINT = "-----";
    private static final String NO_LADDER_POINT = "     ";

    public static void printLadder(Ladder ladder) {
        List<Line> lines = ladder.getLines();
        for(Line line : lines) {
            printLine(line);
        }
    }

    public static void printPlayers(List<Player> players) {
        for(Player player : players) {
            System.out.printf("%-5s ", player.getName());
        }
        System.out.println();
    }

    public static void printResults(List<String> results) {
        for(String result : results) {
            System.out.printf("%-5s ", result);
        }
        System.out.println();
    }

    private static void printLine(Line line) {
        List<Boolean> points = line.getPoints();
        System.out.print("  ");
        for(Boolean point : points) {
            System.out.print("|");
            System.out.print(getPointFormat(point));
        }
        System.out.println("|");
    }

    public static void printResult(String name, List<Player> players, List<String> results) {
        System.out.println("실행 결과");
        if(name.equals("all")) {
            printAllResults(players, results);
            return;
        }
        players.stream().filter(player -> player.getName().equals(name)).forEach(player -> {
            System.out.println(player.getName() + " : " + results.get(player.getPosition()));
        });
    }

    public static void printAllResults(List<Player> players, List<String> results) {
        for(Player player : players) {
            System.out.println(player.getName() + " : " + results.get(player.getPosition()));
        }
    }

    private static String getPointFormat(Boolean point) {
        if(point) return LADDER_POINT;
        return NO_LADDER_POINT;
    }
}
