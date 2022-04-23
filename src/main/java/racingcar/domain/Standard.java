package racingcar.domain;

import static racingcar.constant.ErrorStatus.STANDARD_OUT_OF_RANGE;

public class Standard {

    public final static Standard MOVING_STANDARD = new Standard(4);

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
            throw new IllegalArgumentException(STANDARD_OUT_OF_RANGE.getMessage());
        }
    }
}
