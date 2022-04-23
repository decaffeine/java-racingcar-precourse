package racingcar.ui;

import racingcar.domain.Cars;
import racingcar.domain.Game;

public class ResultView {
    public static void printWinners(Game game) {
        Cars winners = game.getWinners();
        System.out.println("최종 우승자: " + winners.getNames());
    }

}
