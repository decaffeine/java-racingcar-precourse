package racingcar.domain;

import static racingcar.domain.Standard.MOVING_STANDARD;

public class Car implements Comparable<Car> {

    private final CarName name;
    private final Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }

    public String getNameToString() {
        return name.toString();
    }

    public Position getPosition() {
        return position;
    }

    public void tryToMove(Standard standard) {
        if (Standard.compare(standard, MOVING_STANDARD) >= 0) {
            move();
        }
    }

    private void move() {
        position.goForward();
    }

    public void print() {
        System.out.println(name + " : " + position);
    }

    public boolean isAtThePosition(Position comparison) {
        return this.position.equals(comparison);
    }

    @Override
    public int compareTo(Car o) {
        return Position.compare(this.position, o.getPosition());
    }
}
