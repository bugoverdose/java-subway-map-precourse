package subway.service;

import static subway.constants.InstructionMessages.*;
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
                isSuccessful = postStationSuccessful();
            }
            if (userChoice.equals("2")) {
                isSuccessful = deleteStationSuccessful();
            }
            if (userChoice.equals("3")) {
                isSuccessful = readStationSuccessful();
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean postStationSuccessful() {
        try {
            Station newStation = new Station(requestNewStationInput());
            StationRepository.addStation(newStation);
            printPostStationOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteStationSuccessful() {
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

    private boolean readStationSuccessful() {
        printReadStationOutput(StationRepository.stations());
        return true;
    }
}
