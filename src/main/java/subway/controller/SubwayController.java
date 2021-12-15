package subway.controller;

import static subway.constants.InstructionMessages.REQUEST_MAIN_ACTION;
import static subway.view.InputView.*;

import subway.service.LineService;
import subway.service.SectionService;
import subway.service.StationService;

public class SubwayController {

    private final StationService stationService = new StationService();
    private final LineService lineService = new LineService();
    private final SectionService sectionService = new SectionService();

    public SubwayController() {}

    public void run() {
        System.out.println(REQUEST_MAIN_ACTION);
        while (true) {
            String userChoice = requestActionInput();
            if (userChoice.equals("Q")) break;
            if (userChoice.equals("1")) {
                stationService.run();
            }
            if (userChoice.equals("2")) {
                lineService.run();
            }
            if (userChoice.equals("3")) {
                sectionService.run();
            }
            if (userChoice.equals("4")) {
                //TODO
            }
        }
    }
}
