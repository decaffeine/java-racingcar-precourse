package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.Game;
import racingcar.domain.NumberOfAttempts;
import racingcar.ui.CarsNameInputView;
import racingcar.ui.NumberOfAttemptsInputView;

public class Application {
    public static void main(String[] args) {
        Cars cars = CarsNameInputView.get();
        NumberOfAttempts number = NumberOfAttemptsInputView.get();
        Game game = new Game(cars, number);

        while (game.isContinue()) {
            game.race();
        }

        game.printResult();
    }

}
