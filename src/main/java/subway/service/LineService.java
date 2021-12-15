package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.view.InputView.requestActionInput;

public class LineService {
    public void run() {
        System.out.println(REQUEST_LINE_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();
            if (userChoice.equals("1")) {
                // TODO
            }
            if (userChoice.equals("2")) {
                // TODO
            }
            if (userChoice.equals("3")) {
                // TODO
            }
            if (userChoice.equals("B")) break;
        }
    }
}
