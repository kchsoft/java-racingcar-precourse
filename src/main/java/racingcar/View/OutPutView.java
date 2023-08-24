package racingcar.View;

import racingcar.Domain.Car;

import java.util.List;

public class OutPutView {

    public static void printOneRaceCycleResult(List<Car> carList) {
        for (Car car : carList) {
            System.out.printf("%s : ",car.getName());
            printCarPosStatus(car);
        }
        System.out.print("\n");
    }

    private static void printCarPosStatus(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
