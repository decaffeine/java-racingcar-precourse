package racingcar.util;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Standard;
import racingcar.domain.Standards;

public class RandomNumberUtil {
    public static Standards getStandards(int size) {
        List<Standard> result = new ArrayList<>(size);
        while (size > 0) {
            Standard standard = new Standard(Randoms.pickNumberInRange(0, 9));
            result.add(standard);
            size--;
        }
        return new Standards(result);
    }
}
