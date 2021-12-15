package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.utils.InputRangeValidators.validateStationMenuInput;
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
            isSuccessful = selectStationMenuAction(userChoice);
        }
    }

    private boolean selectStationMenuAction(String userChoice) {
        try {
            validateStationMenuInput(userChoice);
            return runStationMenuAction(userChoice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean runStationMenuAction(String userChoice) {
        if (userChoice.equals("1")) {
            return postStation();
        }
        if (userChoice.equals("2")) {
            return deleteStation();
        }
        if (userChoice.equals("3")) {
            return readStation();
        }
        return userChoice.equals("B");
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
            validateDeleteStation(stationName);
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
