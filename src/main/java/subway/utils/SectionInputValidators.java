package subway.utils;

import static subway.constants.ExceptionMessages.NOT_A_SECTION_IN_THE_LINE_EXCEPTION;
import static subway.constants.ExceptionMessages.SECTION_LENGTH_EXCEPTION;
import static subway.utils.LineInputValidators.validateExistingLine;
import static subway.utils.StationInputValidators.validateExistingStation;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class SectionInputValidators {

    public static void validateDeleteSection(String lineName, String stationName) {
        validateExistingLine(lineName);
        validateExistingStation(stationName);

        Line line = LineRepository.findByName(lineName);
        Station station = StationRepository.findByName(stationName);
        validateIsSectionInLine(line, station);

        validateSectionNumberOfLine(line);
    }

    private static void validateIsSectionInLine(Line line, Station station) {
        for (Station section : line.getSections()) {
            if (section == station) return;
        }
        throw new IllegalArgumentException(NOT_A_SECTION_IN_THE_LINE_EXCEPTION);
    }

    private static void validateSectionNumberOfLine(Line line) {
        if (line.getSectionSize() <= 2) {
            throw new IllegalArgumentException(SECTION_LENGTH_EXCEPTION);
        }
    }
}
