package racingcar.Service;

import racingcar.Domain.Car;
import racingcar.Domain.GameInput;
import racingcar.View.OutPutView;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_CAR_NAME_INPUT;
import static racingcar.Constant.GameGuideMsg.GUIDE_MSG_TRY_NUM_INPUT;

public class GameService {

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
        System.out.println("실행 결과");
        for (int i = 0; i < tryNum; i++) {
            oneRaceCycle(carList);
            OutPutView.printOneRaceCycleResult(carList); // need to implementation
        }
    }

    private void oneRaceCycle(List<Car> carList) {
        for (Car car : carList) {
            if(car.isCarMoveForward())
                car.plusOnePos();
        }
    }

    public void pickWinner(List<Car> carList) {
        int maxPos = - 1;
        List<String> winnerList = new LinkedList<>();

        for (Car car : carList) {
            if(car.getPosition() > maxPos)
                maxPos = car.getPosition();
        }

        for (Car car : carList) {
            if(car.getPosition() == maxPos)
                winnerList.add(car.getName());
        }

        OutPutView.printWinner(winnerList);
    }
}
