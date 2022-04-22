package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void carsTryToMove() {
        Cars cars = new Cars(
                Arrays.asList("yoshi", "kirby")
        );
        Position ONE = new Position(1);

        cars.tryToMove(Arrays.asList(3, 7));
        cars.tryToMove(Arrays.asList(8, 2));
        cars.tryToMove(Arrays.asList(1, 1));

        assertThat(cars.get(0).getPosition()).isEqualTo(ONE);
        assertThat(cars.get(1).getPosition()).isEqualTo(ONE);
    }

    @Test
    void 가장_멀리_간_차_1대() {
        Cars cars = new Cars(
                Arrays.asList("yoshi", "kirby", "mario")
        );

        cars.tryToMove(Arrays.asList(6, 6, 2));
        cars.tryToMove(Arrays.asList(7, 5, 1));
        cars.tryToMove(Arrays.asList(8, 3, 1));

        Cars winners = cars.getTheFastest();
        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0).getPosition()).isEqualTo(new Position(3));

    }

    @Test
    void 가장_멀리_간_차_2대() {
        Cars cars = new Cars(
                Arrays.asList("yoshi", "kirby", "mario")
        );

        cars.tryToMove(Arrays.asList(6, 6, 2));
        cars.tryToMove(Arrays.asList(7, 5, 1));
        cars.tryToMove(Arrays.asList(8, 9, 1));

        Cars winners = cars.getTheFastest();
        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners.get(1).getPosition()).isEqualTo(new Position(3));

    }

}
