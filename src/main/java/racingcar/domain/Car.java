package racingcar.domain;

import static racingcar.constant.Constant.ERROR_PREFIX;

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

    public void tryToMove(int standard) {
        if (standard >= 4) {
            move();
        }
    }

    private void move() {
        position.goForward();
    }

    public void print() {
        System.out.println(name.toString() + " : " + getPositionToString());
    }

    public String getPositionToString() {
        return position.toString();
    }

    public boolean isAtThePosition(Position comparison) {
        return this.position.equals(comparison);
    }

    @Override
    public int compareTo(Car o) {
        return Position.compare(this.position, o.getPosition());
    }
}
