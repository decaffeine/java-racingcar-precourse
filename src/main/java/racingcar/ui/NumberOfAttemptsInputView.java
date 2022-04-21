package racingcar.ui;

import static racingcar.constant.Constant.ERROR_PREFIX;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;
import racingcar.domain.NumberOfAttempts;

public class NumberOfAttemptsInputView {

    private static final Pattern pattern = Pattern.compile("^[0-9]*$");

    public static NumberOfAttempts get() {
        // TODO CarNameInputView와 유사함. 구조 재활용?
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        validate(input);
        return new NumberOfAttempts(Integer.parseInt(input));
    }

    private static void validate(String input) {
        if (!pattern.matcher(input).find()) {
            throw new IllegalArgumentException(ERROR_PREFIX + "시도할 횟수 입력은 숫자여야 합니다.");
        }
    }

}
