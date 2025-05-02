package controller;

import domain.Ladder;
import domain.Player;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class LadderController {

    public void run() {
        int ladderWidth = InputView.InputWidth();
        int ladderHeight = InputView.InputHeight();
        Ladder ladder = new Ladder(ladderWidth, ladderHeight);
        OutputView.printLadder(ladder);

        List<Player> players = new ArrayList<>();
        for(int i = 0; i < ladderWidth; i++) {
            players.add(new Player(i));
        }

        for(Player player : players) {
            player.down(ladder);
        }

        OutputView.printResult(players);
    }

}
