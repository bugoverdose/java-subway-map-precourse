package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.view.InputView.*;

public class SectionService {

    public void run() {
        System.out.println(REQUEST_SECTION_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();

            if (userChoice.equals("1")) {
            }
            if (userChoice.equals("2")) {
            }
            if (userChoice.equals("3")) {
            }
            if (userChoice.equals("B")) break;
        }
    }
}
