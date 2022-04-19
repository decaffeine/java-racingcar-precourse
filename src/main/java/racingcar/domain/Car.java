package racingcar.domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
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

}
