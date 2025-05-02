package controller;

import domain.Ladder;
import domain.Name;
import domain.Player;
import domain.Players;
import domain.Position;
import domain.Results;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class LadderController {

    Players players;
    Results results;

    public void run() {
        players = Players.of(InputView.inputPlayerNames());
        results = Results.of(InputView.inputResults());
        int ladderWidth = players.getPlayers().size();
        int ladderHeight = InputView.inputHeight();

        Ladder ladder = new Ladder(ladderWidth, ladderHeight);
        OutputView.printLadderInfo(players, results, ladder);
        players.getPlayers().forEach(player -> player.downLadder(ladder));
        while(checkResultLoop());
    }

    private Boolean checkResultLoop() {
        String name = InputView.inputPlayerNameToCheckResult();
        if(name.isEmpty()) return false;
        OutputView.printResult(name ,players.getPlayers(), results.getResults());
        return true;
    }

}
