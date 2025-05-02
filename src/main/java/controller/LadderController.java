package controller;

import domain.Ladder;
import view.InputView;
import view.OutputView;

public class LadderController {

    public void run() {
        int ladderWidth = InputView.InputWidth();
        int ladderHeight = InputView.InputHeight();
        Ladder ladder = new Ladder(ladderWidth, ladderHeight);
        OutputView.printLadder(ladder);
    }

}
