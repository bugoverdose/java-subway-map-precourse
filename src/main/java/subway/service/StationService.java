package subway.service;

import static subway.view.InputView.requestStationMenuAction;

import subway.domain.StationRepository;

public class StationService {
    private static final StationRepository stationRepository = new StationRepository();

    public void run() {
        while (true) {
            String userChoice = requestStationMenuAction();
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
