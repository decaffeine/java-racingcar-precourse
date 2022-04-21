package racingcar.util;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberUtil {
    public static List<Integer> getStandards(int size) {
        List<Integer> result = new ArrayList<>(size);
        while (size > 0) {
            result.add(Randoms.pickNumberInRange(0, 9));
            size--;
        }
        return result;
    }
}
