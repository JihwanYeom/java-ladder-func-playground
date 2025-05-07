package controller;

import domain.Ladder;
import domain.Players;
import domain.Results;
import view.InputView;
import view.OutputView;

public class LadderController {

    private final Players players;
    private final Results results;

    public LadderController() {
        players = Players.of(InputView.inputPlayerNames());
        results = Results.of(InputView.inputResults());
    }

    public void run() {
        Ladder ladder = createLadder();
        OutputView.printLadderInfo(players, results, ladder);
        players.moveDown(ladder);
        runResultQueryLoop();
    }

    private Ladder createLadder() {
        int ladderWidth = players.getPlayers().size();
        int ladderHeight = InputView.inputHeight();
        return new Ladder(ladderWidth, ladderHeight);
    }

    private void runResultQueryLoop() {
        while (checkResultLoop()) ;
    }

    private Boolean checkResultLoop() {
        String name = InputView.inputPlayerNameToCheckResult();
        if (name.isEmpty()) {
            return false;
        }
        OutputView.printResult(name, players, results);
        return true;
    }

}
