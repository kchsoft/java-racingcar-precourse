package racingcar.Domain;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static racingcar.Constant.GameDefaultValue.RANDOM_NUM_FINAL_RANGE;
import static racingcar.Constant.GameDefaultValue.RANDOM_NUM_START_RANGE;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean isCarMoveForward() {
        int randNum = pickNumberInRange(RANDOM_NUM_START_RANGE,RANDOM_NUM_FINAL_RANGE);
        if(randNum >= 4) return true;
        return false;
    }

    public void plusOnePos() {
        this.position += 1;
    }
}
