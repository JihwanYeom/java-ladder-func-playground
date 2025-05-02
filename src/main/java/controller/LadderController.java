package controller;

import domain.Ladder;
import domain.Player;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class LadderController {

    List<String> results;
    List<Player> players = new ArrayList<>();

    public void run() {

        List<String> names = InputView.inputPlayerNames();

        for(int i = 0; i < names.size(); i++) {
            players.add(new Player(names.get(i), i));
        }
        results = InputView.inputResults();
        int ladderHeight = InputView.inputHeight();

        Ladder ladder = new Ladder(names.size(), ladderHeight);
        OutputView.printPlayers(players);
        OutputView.printLadder(ladder);
        OutputView.printResults(results);
        for(Player player : players) {
            player.down(ladder);
        }
        while(checkResultLoop());

    }

    private Boolean checkResultLoop() {
        String name = InputView.inputPlayerNameToCheckResult();
        if(name.isEmpty()) return false;
        OutputView.printResult(name ,players, results);
        return true;
    }

}
