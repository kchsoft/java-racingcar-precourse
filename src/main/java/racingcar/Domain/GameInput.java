package racingcar.Domain;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Validation.CarNameValidation;
import racingcar.Validation.TryNumValidation;

public class GameInput {

    public static String[]  carsNameInput(){
        String nameStr = Console.readLine();
        String[] carsName = nameStr.split(",");
        if(!CarNameValidation.isValidCarName(carsName)) return null;
        return carsName;
    }

    public static int tryNumInput(){
        String tryNum = Console.readLine();
        if (!TryNumValidation.isValidTryNum(tryNum)) return -1;
        return Integer.parseInt(tryNum);
    }
}
