package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

public class Car implements Comparable<Car> {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private final Position position;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.position = new Position();
    }

    public Position getPosition() {
        return position;
    }

    public void tryToMove(int standard) {
        if (standard >= 4) {
            move();
        }
    }

    private void move() {
        position.goForward();
    }

    public void print() {
        System.out.println(name + " : " + getPositionToString());
    }

    public String getPositionToString() {
        return position.toString();
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_PREFIX + "이름은 5자 이하여야 합니다.");
        }
    }

    @Override
    public int compareTo(Car o) {
        return Position.compare(this.position, o.getPosition());
    }
}
