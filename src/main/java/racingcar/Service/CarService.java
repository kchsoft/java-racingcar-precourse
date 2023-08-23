package racingcar.Service;

import racingcar.Domain.Car;

import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static racingcar.Constant.GameDefaultValue.RANDOM_NUM_FINAL_RANGE;
import static racingcar.Constant.GameDefaultValue.RANDOM_NUM_START_RANGE;

public class CarService {

    public boolean isCarMoveForward() {
        int randNum = pickNumberInRange(RANDOM_NUM_START_RANGE,RANDOM_NUM_FINAL_RANGE);
        if(randNum >= 4) return true;
        return false;
    }


}
