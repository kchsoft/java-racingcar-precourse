package racingcar.Controller;

import racingcar.Domain.GameInput;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;
import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_TRY_NUM_INPUT;

public class RacingCarGame {

    public void playRacingCarGame() {
        String[] carsName = null;
        int tryNum = -1;
        while (carsName == null) {
            System.out.println(GUIDE_MSG_CAR_NAME_INPUT);
            carsName = GameInput.carsNameInput();
        }
        while (tryNum < 0) {
            System.out.println(GUIDE_MSG_TRY_NUM_INPUT);
            tryNum = GameInput.tryNumInput();
        }
    }
}
