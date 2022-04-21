package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

public class NumberOfAttempts {
    private int number;

    public NumberOfAttempts(int number) {
        validate(number);
        this.number = number;
    }

    public void subtract() {
        this.number--;
    }

    private void validate(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(ERROR_PREFIX + "시도 횟수는 0보다 커야 합니다.");
        }
    }

    public boolean areRemain() {
        return number > 0;
    }
}
