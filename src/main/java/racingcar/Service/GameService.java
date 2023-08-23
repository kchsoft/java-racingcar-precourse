package racingcar.Service;

import racingcar.Domain.Car;
import racingcar.Domain.GameInput;

import java.util.LinkedList;
import java.util.List;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;
import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_TRY_NUM_INPUT;

public class GameService {

    final CarService carService;

    public GameService() {
        this.carService = new CarService();
    }

    public String[] userInputCarsName() {
        String[] carsName = null;
        while (carsName == null) {
            System.out.println(GUIDE_MSG_CAR_NAME_INPUT);
            carsName = GameInput.carsNameInput();
        }
        return carsName;
    }

    public int userInputTryNum() {
        int tryNum = -1;
        while (tryNum < 0) {
            System.out.println(GUIDE_MSG_TRY_NUM_INPUT);
            tryNum = GameInput.tryNumInput();
        }
        return tryNum;
    }

    public List<Car> makeCarList(String[] carsName) {
        List<Car> carList = new LinkedList<Car>();
        for (String car : carsName) {
            carList.add(new Car(car));
        }
        return carList;
    }

    public void startCarRace(int tryNum, List<Car> carList) {
        for (int i = 0; i < tryNum; i++) {
            oneRaceCycle(carList);
            OutPutView.outputResult(carList); // need to implementation
        }
    }

    public void oneRaceCycle(List<Car> carList) {
        for (Car car : carList) {
            if(carService.isCarMoveForward())
                car.plusOnePos();
        }
    }
}
