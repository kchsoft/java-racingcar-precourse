package racingcar.Controller;

import racingcar.Domain.GameInput;

public class RacingCarGame {

    public void playRacingCarGame() {
        String[] carsName = null;
        while (carsName == null) {
            carsName = GameInput.carsNameInput();
        }
    }
}
