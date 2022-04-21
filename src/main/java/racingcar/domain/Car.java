package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

public class Car {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int position;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void tryToMove(int standard) {
        if (standard >= 4) {
            move();
        }
    }

    private void move() {
        this.position++;
    }

    public String getPositionToString() {
        return new String(new char[position]).replace("\0", "-");
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_PREFIX + "이름은 5자 이하여야 합니다.");
        }
    }

}
