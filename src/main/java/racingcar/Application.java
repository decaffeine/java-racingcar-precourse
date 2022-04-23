package racingcar;

import static racingcar.constant.Constant.ERROR_PREFIX;

import racingcar.domain.Cars;
import racingcar.domain.Game;
import racingcar.domain.NumberOfAttempts;
import racingcar.ui.CarsNameInputView;
import racingcar.ui.NumberOfAttemptsInputView;

public class Application {
    public static void main(String[] args) {
        Cars cars = CarsNameInputView.get();
        NumberOfAttempts number = NumberOfAttemptsInputView.get();
        validate(cars, number);
        Game game = new Game(cars, number);

        while (game.isContinue()) {
            game.race();
        }

        game.printResult();
    }

    private static void validate(Cars cars, NumberOfAttempts number) {
        if (cars == null || number == null) {
            throw new IllegalStateException(ERROR_PREFIX + "강제 종료");
        }
     }

}
