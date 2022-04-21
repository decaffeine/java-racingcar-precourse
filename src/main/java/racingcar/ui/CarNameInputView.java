package racingcar.ui;

import static racingcar.constant.Constant.ERROR_PREFIX;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import racingcar.constant.InputStatus;
import racingcar.domain.Cars;

public class CarNameInputView {

    private static final Pattern pattern = Pattern.compile("^[a-zA-Z,]*$");
    private static InputStatus status = InputStatus.INPUT_IN_PROGRESS;

    public static Cars get() {
        Cars cars = null; // null 말고 다른 좋은 방법??
        while (status.isContinue()) {
            cars = getCarsFromInput();
        }
        return cars;
    }

    private static Cars getCarsFromInput() {
        try {
            String input = getConsoleInput();
            validateConsoleInput(input);
            status = InputStatus.INPUT_END;
            return new Cars(convertToList(input));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            status = InputStatus.INPUT_IN_PROGRESS;
        }
        return null;
    }

    private static String getConsoleInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        return Console.readLine();
    }

    private static void validateConsoleInput(String input) {
        if (!pattern.matcher(input).find()) {
            throw new IllegalArgumentException(ERROR_PREFIX + "이름은 알파벳과 쉼표(,)로 구분된 입력이어야 합니다.");
        }
    }

    private static List<String> convertToList(String input) {
        return new ArrayList<String>(Arrays.asList(input.split(",")));
    }

}
