package racingcar.Validation;

import java.util.HashSet;

import static racingcar.Constant.GameDefaultValue.CAR_NAME_MAX_SIZE;
import static racingcar.Constant.GameErrMsg.*;

public class CarNameValidation {

    public static boolean isValidCarName(String[] carsName) {
        HashSet<String> carSet = new HashSet<>();
        try {
            for (String car : carsName) {
                isNameSizeValid(car);
                isDuplicatedName(car, carSet);
                isEmptyString(car);
                isThereWhiteSpace(car);
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void isNameSizeValid(String carName) {
        if(carName.length() > CAR_NAME_MAX_SIZE) throw new IllegalArgumentException(ERR_MSG_CAR_NAME_SIZE_OVER);
        return;
    }

    private static void isDuplicatedName(String carName , HashSet<String> carSet) {
        if(carSet.contains(carName)) throw new IllegalArgumentException(ERR_MSG_CAR_NAME_DUPLICATED);
        carSet.add(carName);
        return;
    }

    public static void isEmptyString(String carName){
        if(carName.equals("")) throw new IllegalArgumentException(ERR_MSG_CAR_NAME_EMPTY_STRING);
        return;
    }

    public static void isThereWhiteSpace(String carName) {
        char[] nameArr = carName.toCharArray();
        for (char c : nameArr) {
            if(c == ' ') throw new IllegalArgumentException(ERR_MSG_CAR_NAME_WHITE_SPACE);
        }
        return;
    }
}
