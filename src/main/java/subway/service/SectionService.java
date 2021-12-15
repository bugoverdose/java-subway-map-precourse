package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;

import static subway.constants.InstructionMessages.*;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;

public class SectionService {

    public void run() {
        System.out.println(REQUEST_SECTION_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();

            if (userChoice.equals("1")) {
                isSuccessful = postSectionSuccessful();
            }
            if (userChoice.equals("2")) {
            }
            if (userChoice.equals("3")) {
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean postSectionSuccessful() {
        try {
            Line line = LineRepository.findByName(requestTargetLineInput());
            Station targetStation = new Station(requestTargetStationInput());
            int idx = Integer.parseInt(requestStationIdxInput());
            line.addSections(idx, targetStation);
            printPostSectionOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
