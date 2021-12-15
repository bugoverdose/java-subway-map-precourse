package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

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
                isSuccessful = postSection();
            }
            if (userChoice.equals("2")) {
                isSuccessful = deleteSection();
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean postSection() {
        try {
            Line line = LineRepository.findByName(requestTargetLineInput());
            Station targetStation = new Station(requestTargetStationInput());
            int idx = Integer.parseInt(requestStationIdxInput());
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
