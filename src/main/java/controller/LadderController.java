package controller;

import domain.Ladder;
import view.OutputView;

public class LadderController {

    public void run() {
        Ladder ladder = new Ladder(3, 4);
        OutputView.printLadder(ladder);
    }

}
