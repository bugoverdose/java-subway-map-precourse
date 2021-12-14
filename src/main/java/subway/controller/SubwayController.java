package subway.controller;

import subway.service.StationService;

import static subway.view.InputView.*;

public class SubwayController {

    private final StationService stationService = new StationService();

    public SubwayController() {}

    public void run() {
        while (true) {
            String userChoice = requestMainMenuAction();
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
