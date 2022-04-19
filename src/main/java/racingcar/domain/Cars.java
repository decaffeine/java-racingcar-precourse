package racingcar.domain;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
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
