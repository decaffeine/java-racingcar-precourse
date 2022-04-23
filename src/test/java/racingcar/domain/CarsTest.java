package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void carsTryToMove() {
        Cars cars = new Cars(Arrays.asList("yoshi", "kirby"));
        Position ONE = new Position(1);

        cars.tryToMove(new Standards(Arrays.asList(new Standard(3), new Standard(7))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(8), new Standard(2))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(1), new Standard(1))));

        assertThat(cars.get(0).getPosition()).isEqualTo(ONE);
        assertThat(cars.get(1).getPosition()).isEqualTo(ONE);
    }

    @Test
    void 가장_멀리_간_차_1대() {
        Cars cars = new Cars(Arrays.asList("yoshi", "kirby", "mario"));

        cars.tryToMove(new Standards(Arrays.asList(new Standard(6), new Standard(6), new Standard(2))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(7), new Standard(5), new Standard(1))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(8), new Standard(3), new Standard(1))));

        Cars winners = cars.getTheFarthest();
        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0).getPosition()).isEqualTo(new Position(3));
    }

    @Test
    void 가장_멀리_간_차_2대() {
        Cars cars = new Cars(Arrays.asList("yoshi", "kirby", "mario"));

        cars.tryToMove(new Standards(Arrays.asList(new Standard(6), new Standard(6), new Standard(2))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(7), new Standard(5), new Standard(1))));
        cars.tryToMove(new Standards(Arrays.asList(new Standard(8), new Standard(9), new Standard(1))));

        Cars winners = cars.getTheFarthest();
        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners.get(1).getPosition()).isEqualTo(new Position(3));
    }

}
