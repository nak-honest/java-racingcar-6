package racingcar.controller;

import racingcar.view.InputView;

public class GameController {
    private final InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }
    public void startGame() {
        String carNames = inputView.readCarNames();
        System.out.println(carNames);
    }
}
