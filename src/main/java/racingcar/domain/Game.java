package racingcar.domain;

import java.util.List;
import racingcar.util.RandomNumberUtil;

public class Game {
    private final Cars cars;
    private final NumberOfAttempts numberOfAttempts;

    public Game(Cars cars, NumberOfAttempts numberOfAttempts) {
        this.cars = cars;
        this.numberOfAttempts = numberOfAttempts;
    }

    public boolean isContinue() {
        return numberOfAttempts.areRemain();
    }

    public void race() {
        List<Integer> randomStandards = RandomNumberUtil.getStandards(cars.size());
        cars.tryToMove(randomStandards);
        cars.print();
        numberOfAttempts.subtract();
    }

}
