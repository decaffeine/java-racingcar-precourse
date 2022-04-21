package racingcar.domain;

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
        numberOfAttempts.subtract();
    }

}
