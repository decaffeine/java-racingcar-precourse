package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

public class Standard {
    private final int standard;

    public Standard(int standard) {
        validate(standard);
        this.standard = standard;
    }

    public int getValue() {
        return standard;
    }

    public static int compare(Standard x, Standard y) {
        return Integer.compare(x.getValue(), y.getValue());
    }

    private void validate(int standard) {
        if (standard < 0 || standard > 9) {
            throw new IllegalArgumentException(ERROR_PREFIX + "전진 조건은 0-9 사이의 랜덤한 정수입니다.");
        }
    }
}
