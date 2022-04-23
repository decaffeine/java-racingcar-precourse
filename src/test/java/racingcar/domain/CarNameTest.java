package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    void 자동차_이름_최대길이_초과() {
        assertThatThrownBy(
                () -> new CarName("pikachu"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
