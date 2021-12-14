package subway.service;

import static subway.constants.InstructionMessages.REQUEST_STATION_MENU_ACTION;
import static subway.view.InputView.*;

import subway.domain.StationRepository;

public class StationService {
    private static final StationRepository stationRepository = new StationRepository();

    public void run() {
        System.out.println(REQUEST_STATION_MENU_ACTION);
        while (true) {
            String userChoice = requestUserInput();
            if (userChoice.equals("1")) {
                //TODO
            }
            if (userChoice.equals("2")) {
                //TODO
            }
            if (userChoice.equals("3")) {
                //TODO
            }
            if (userChoice.equals("B")) {
                //TODO
            }
        }
    }
}
