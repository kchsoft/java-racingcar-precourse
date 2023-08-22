package racingcar.Validation;

import java.util.regex.Pattern;

import static racingcar.Constant.GameErrMsg.ERR_MSG_TRY_NUMBER_INTEGER;

public class TryNumValidation {

    public static boolean isValidTryNum(String tryNum) {
        try {
            isIntegerString(tryNum);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void isIntegerString(String tryNum) throws IllegalArgumentException {
        String pattern = "^[0-9]+$";
        Pattern compiled = Pattern.compile(pattern);
        if(!compiled.matcher(tryNum).matches()) throw new IllegalArgumentException(ERR_MSG_TRY_NUMBER_INTEGER);
        return;
    }
}
