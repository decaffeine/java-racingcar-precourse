package racingcar.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getConsoleInputWithMessage(String message) {
        System.out.println(message);
        return Console.readLine();
    }

}
