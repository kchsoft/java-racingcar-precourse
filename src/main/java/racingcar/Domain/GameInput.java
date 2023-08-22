package racingcar.Domain;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Validation.CarNameValidation;

public class GameInput {

    public static String[]  carsNameInput() throws IllegalArgumentException{
        String nameStr = Console.readLine();
        String[] carsName = nameStr.split(",");
        if(!CarNameValidation.isValidCarName(carsName)) return null;
        return carsName;
    }
}
