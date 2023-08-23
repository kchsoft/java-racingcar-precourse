package racingcar.Controller;

import racingcar.Domain.GameInput;
import racingcar.Service.GameService;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;
import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_TRY_NUM_INPUT;

public class RacingCarGame {
    final GameService gameService;
    public RacingCarGame(){
        gameService = new GameService();
    }
    public void playRacingCarGame() {
        String[] carsName = gameService.userInputCarsName();
        int tryNum = gameService.userInputTryNum();


    }
}
