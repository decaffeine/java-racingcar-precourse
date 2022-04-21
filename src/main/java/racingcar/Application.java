package racingcar;

import racingcar.domain.Cars;
import racingcar.ui.CarNameInputView;

public class Application {
    public static void main(String[] args) {
        Cars cars = CarNameInputView.get();
    }
}
