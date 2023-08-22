package racingcar.Controller;

import racingcar.Domain.GameInput;

public class RacingCarGame {

    public void playRacingCarGame() {
        String[] carsName = null;
        while (carsName == null) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            carsName = GameInput.carsNameInput();
        }
    }
}
