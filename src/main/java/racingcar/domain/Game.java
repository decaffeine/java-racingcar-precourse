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
        Standards standards = RandomNumberUtil.getStandards(cars.size());
        cars.tryToMove(standards);
        cars.print();
        numberOfAttempts.subtract();
    }

    public void printResult() {
        Cars winners = cars.getTheFarthest();
        System.out.println("최종 우승자: " + winners.getNames());
    }

}
