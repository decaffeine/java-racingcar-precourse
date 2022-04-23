package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<String> carNames) {
        for (String name : carNames) {
            this.cars.add(new Car(name));
        }
    }

    public Cars(Set<Car> carSet) {
        this.cars = new ArrayList<>(carSet);
    }

    public Car get(int index) {
        return cars.get(index);
    }

    public int size() {
        return cars.size();
    }

    public void tryToMove(Standards standards) {
        for (int i = 0; i < cars.size(); i++) {
            Standard standard = standards.get(i);
            cars.get(i).tryToMove(standard);
        }
    }

    public String getNames() {
        List<String> names = new ArrayList<>();
        for (Car car : cars) {
            names.add(car.getNameToString());
        }
        return String.join(",", names);
    }

    public void print() {
        System.out.println();
        for (Car car : cars) {
            car.print();
        }
    }

    public Cars getTheFarthest() {
        cars.sort(Collections.reverseOrder());
        Position farthest = cars.get(0).getPosition();
        return getCarsByPosition(farthest);
    }

    private Cars getCarsByPosition(Position position) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            addCarIfIsAtThePosition(result, car, position);
        }
        return new Cars(result);
    }

    private void addCarIfIsAtThePosition(Set<Car> set, Car car, Position position) {
        if (car.isAtThePosition(position)) {
            set.add(car);
        }
    }

}
