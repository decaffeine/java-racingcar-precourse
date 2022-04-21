package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> carNames) {
        for (String name : carNames) {
            this.cars.add(new Car(name));
        }
    }

    public Car get(int location) {
        return cars.get(location);
    }

    public void tryToMove(List<Integer> standards) {
        for (int i = 0; i < cars.size(); i++) {
            int standard = standards.get(i);
            cars.get(i).tryToMove(standard);
        }
    }
}
