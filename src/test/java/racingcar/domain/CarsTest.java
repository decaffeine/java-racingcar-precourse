package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void carsTryToMove() {
        Cars cars = new Cars(
                Arrays.asList(new Car("yoshi"),
                             new Car("pikachu"))
        );
        cars.tryToMove(Arrays.asList(3,7));
        cars.tryToMove(Arrays.asList(8,2));
        cars.tryToMove(Arrays.asList(1,1));

        assertThat(cars.get(0).getPosition()).isEqualTo(1);
        assertThat(cars.get(1).getPosition()).isEqualTo(1);
    }
}
