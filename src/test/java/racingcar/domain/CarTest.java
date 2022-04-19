package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_움직임() {
        Car car = new Car("yoshi");
        car.attempt(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_멈춤() {
        Car car = new Car("pikachu");
        car.attempt(2);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
