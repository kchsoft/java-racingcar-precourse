package racingcar.Domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void plusOnePos() {
        this.position += 1;
    }
}
