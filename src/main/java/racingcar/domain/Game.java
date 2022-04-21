package racingcar.domain;

public class Game {
    private Cars cars;
    private NumberOfAttempts numberOfAttempts;

    public Game(Cars cars, NumberOfAttempts numberOfAttempts) {
        this.cars = cars;
        this.numberOfAttempts = numberOfAttempts;
    }

}
