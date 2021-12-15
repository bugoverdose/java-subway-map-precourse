package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.utils.StationInputValidators.*;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;

import subway.domain.Station;
import subway.domain.StationRepository;

public class StationService {

    public void run() {
        System.out.println(REQUEST_STATION_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();

            if (userChoice.equals("1")) {
                isSuccessful = postStation();
            }
            if (userChoice.equals("2")) {
                isSuccessful = deleteStation();
            }
            if (userChoice.equals("3")) {
                isSuccessful = readStation();
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean postStation() {
        try {
            String newStationName = requestNewStationInput();
            validatePostStation(newStationName);
            Station newStation = new Station(newStationName);
            StationRepository.addStation(newStation);
            printPostStationOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteStation() {
        try {
            String stationName = requestDeleteStationInput();
            StationRepository.deleteStation(stationName);
            printDeleteStationOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean readStation() {
        printReadStationOutput(StationRepository.stations());
        return true;
    }
}
