package subway.controller;

import static subway.constants.InstructionMessages.REQUEST_MAIN_ACTION;
import static subway.view.InputView.*;

import subway.service.StationService;

public class SubwayController {

    private final StationService stationService = new StationService();

    public SubwayController() {}

    public void run() {
        System.out.println(REQUEST_MAIN_ACTION);
        while (true) {
            String userChoice = requestUserInput();
            if (userChoice.equals("Q")) break;
            if (userChoice.equals("1")) {
                stationService.run();
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
