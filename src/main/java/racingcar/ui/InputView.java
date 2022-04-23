package racingcar.ui;

import static racingcar.constant.Constant.ERROR_PREFIX;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String EMPTY_STRING = "";

    public static String getConsoleInputWithMessage(String message) {
        System.out.println(message);
        String output = Console.readLine();
        validate(output);
        return output;
    }

    private static void validate(String line) {
        if (EMPTY_STRING.equals(line)) {
            throw new IllegalArgumentException(ERROR_PREFIX + "입력은 공백일 수 없습니다.");
        }
    }

}
