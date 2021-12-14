package subway.service;

import static subway.constants.InstructionMessages.REQUEST_STATION_MENU_ACTION;
import static subway.view.InputView.*;

import subway.domain.Station;
import subway.domain.StationRepository;

public class StationService {
    public void run() {
        System.out.println(REQUEST_STATION_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();

            if (userChoice.equals("1")) {
                isSuccessful = addNewStationSuccessful();
            }
            if (userChoice.equals("2")) {
                //TODO
            }
            if (userChoice.equals("3")) {
                //TODO
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean addNewStationSuccessful() {
        try {
            Station newStation = new Station(requestNewStationInput());
            StationRepository.addStation(newStation);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
