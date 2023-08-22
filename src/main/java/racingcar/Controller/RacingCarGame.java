package racingcar.Controller;

import racingcar.Domain.GameInput;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;

public class RacingCarGame {

    public void playRacingCarGame() {
        String[] carsName = null;
        while (carsName == null) {
            System.out.println(GUIDE_MSG_CAR_NAME_INPUT);
            carsName = GameInput.carsNameInput();
        }
    }
}
