package domain;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> players;

    private Players(List<Player> players) {
        this.players = players;
    }

    public static Players of(List<String> names) {
        List<Player> players = new ArrayList<>();
        for (String name : names) {
            Name playerName = new Name(name);
            Position playerPosition = new Position(names.indexOf(name));
            players.add(new Player(playerName, playerPosition));
        }
        return new Players(players);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
