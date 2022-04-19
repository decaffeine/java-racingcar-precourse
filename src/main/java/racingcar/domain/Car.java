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

    public void attempt(int standard) {
        if (standard >= 4) {
            move();
        }
    }

    private void move() {
        this.position++;
    }
    
}
