package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Standards {
    List<Standard> standards = new ArrayList<>();

    public Standards(List<Standard> standards) {
        this.standards = standards;
    }

    public Standard get(int index) {
        return standards.get(index);
    }

}
