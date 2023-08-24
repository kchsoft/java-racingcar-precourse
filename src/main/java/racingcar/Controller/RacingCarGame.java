package racingcar.Controller;

import racingcar.Domain.Car;
import racingcar.Service.GameService;

import java.util.List;

public class RacingCarGame {
    final GameService gameService;
    public RacingCarGame(){
        gameService = new GameService();
    }
    public void playRacingCarGame() {
        String[] carsName = gameService.userInputCarsName();
        List<Car> carList = gameService.makeCarList(carsName);
        int tryNum = gameService.userInputTryNum();
        gameService.startCarRace(tryNum,carList);
        gameService.pickWinner(carList);
    }
}
