package subway.controller;

import static subway.view.InputView.*;

import java.util.Scanner;

public class SubwayController {

    public SubwayController() {}

    public void run() {
        while (true) {
            String userChoice = requestMainMenuAction();
            if (userChoice.equals("Q")) break;
            if (userChoice.equals("1")) {
                //TODO
            }
            if (userChoice.equals("2")) {
                //TODO
            }
            if (userChoice.equals("3")) {
                //TODO
            }
            if (userChoice.equals("4")) {
                //TODO
            }
        }
    }
}
