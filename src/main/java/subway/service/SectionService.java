package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.utils.InputRangeValidators.validateAndParseToInt;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class SectionService {

    public void run() {
        System.out.println(REQUEST_SECTION_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();
            isSuccessful = selectSectionMenuAction(userChoice);
        }
    }

    private boolean selectSectionMenuAction(String userChoice) {
        if (userChoice.equals("1")) {
            return postSection();
        }
        if (userChoice.equals("2")) {
            return deleteSection();
        }
        return userChoice.equals("B");
    }

    private boolean postSection() {
        try {
            Line line = LineRepository.findByName(requestTargetLineInput());
            Station targetStation = StationRepository.findByName(requestTargetStationInput());
            int idx = validateAndParseToInt(requestStationIdxInput(), line);
            line.addSection(idx, targetStation);
            targetStation.setIsSection(true);
            printPostSectionOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteSection() {
        try {
            String lineName = requestDeleteSectionLineInput();
            String stationName = requestDeleteSectionStationInput();
            LineRepository.deleteSectionByLineNameAndStationName(lineName, stationName);
            StationRepository.updateIsSection(StationRepository.findByName(stationName));
            printDeleteSectionOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
