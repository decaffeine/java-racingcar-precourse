package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_움직임() {
        Car car = new Car("yoshi");
        car.tryToMove(5);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void 자동차_멈춤() {
        Car car = new Car("kirby");
        car.tryToMove(2);
        assertThat(car.getPosition()).isEqualTo(new Position());
    }

    @Test
    void 현재_위치_표시() {
        Car car = new Car("mario");
        car.tryToMove(7);
        car.tryToMove(5);
        car.tryToMove(2);
        assertThat(car.getPositionToString()).isEqualTo("--");
    }
}
