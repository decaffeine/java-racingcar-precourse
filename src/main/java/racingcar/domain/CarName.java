package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_PREFIX + "이름은 5자 이하여야 합니다.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
