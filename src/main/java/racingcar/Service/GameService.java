package racingcar.Service;

import racingcar.Domain.GameInput;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;
import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_TRY_NUM_INPUT;

public class GameService {
    public String[] userInputCarsName() {
        String[] carsName = null;
        while (carsName == null) {
            System.out.println(GUIDE_MSG_CAR_NAME_INPUT);
            carsName = GameInput.carsNameInput();
        }
        return carsName;
    }

    public int userInputTryNum() {
        int tryNum = - 1;
        while (tryNum < 0) {
            System.out.println(GUIDE_MSG_TRY_NUM_INPUT);
            tryNum = GameInput.tryNumInput();
        }
        return tryNum;
    }
}
