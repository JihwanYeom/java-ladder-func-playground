package controller;

import domain.Ladder;
import domain.Players;
import domain.Results;
import view.InputView;
import view.OutputView;

public class LadderController {

    Players players;
    Results results;

    public void run() {
        initializeGame();
        Ladder ladder = createLadder();
        OutputView.printLadderInfo(players, results, ladder);
        movePlayersDown(ladder);
        runResultQueryLoop();
    }

    private void initializeGame() {
        players = Players.of(InputView.inputPlayerNames());
        results = Results.of(InputView.inputResults());
    }

    private Ladder createLadder() {
        int ladderWidth = players.getPlayers().size();
        int ladderHeight = InputView.inputHeight();
        return new Ladder(ladderWidth, ladderHeight);
    }

    private void movePlayersDown(Ladder ladder) {
        players.getPlayers().forEach(player -> player.downLadder(ladder));
    }

    private void runResultQueryLoop() {
        while (checkResultLoop());
    }

    private Boolean checkResultLoop() {
        String name = InputView.inputPlayerNameToCheckResult();
        if(name.isEmpty()) return false;
        OutputView.printResult(name, players, results);
        return true;
    }

}
