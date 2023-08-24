package racingcar.View;

import jdk.nashorn.internal.ir.SwitchNode;
import racingcar.Domain.Car;

import java.util.Iterator;
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

    public static void printWinner(List<String> winnerList) {
        String winner = null;
        System.out.print("최종 우승자 : ");

        Iterator<String> iterator = winnerList.iterator();
        winner = iterator.next();
        System.out.print(winner);

        while (iterator.hasNext()) {
            winner = iterator.next();
            System.out.printf(", %s", winner);
        }
    }
}
