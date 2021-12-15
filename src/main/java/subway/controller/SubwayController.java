package subway.controller;

import static subway.utils.InputRangeValidators.*;
import static subway.constants.InstructionMessages.REQUEST_MAIN_ACTION;
import static subway.view.InputView.*;

import subway.domain.LineRepository;
import subway.domain.StationRepository;
import subway.service.LineService;
import subway.service.SectionService;
import subway.service.StationService;

public class SubwayController {

    private final StationService stationService = new StationService();
    private final LineService lineService = new LineService();
    private final SectionService sectionService = new SectionService();

    public SubwayController() {
    }

    public void run() {
        boolean isRunning = true;
        initDatabase();

        while (isRunning) {
            System.out.println(REQUEST_MAIN_ACTION);
            isRunning = selectMainMenuAction();
        }

        scanner.close();
    }

    private void initDatabase() {
        StationRepository.initDatabase();
        LineRepository.initDatabase();
    }

    private boolean selectMainMenuAction() {
        while (true) {
            try {
                String userChoice = requestActionInput();
                validateMainMenuInput(userChoice);
                return runMainMenuAction(userChoice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean runMainMenuAction(String userChoice) {
        if (userChoice.equals("Q")) {
            return false;
        }
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
            lineService.readAllLines();
        }
        return true;
    }
}
