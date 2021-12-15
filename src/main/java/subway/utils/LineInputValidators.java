package subway.utils;

import static subway.constants.ExceptionMessages.*;

import subway.domain.LineRepository;
import subway.domain.StationRepository;

public class LineInputValidators {

    public static void validatePostLine(String lineName) {
        validateUniqueLineName(lineName);
        validateLineNameLength(lineName);
    }

    private static void validateUniqueLineName(String lineName) {
        if (LineRepository.checkExistsByName(lineName)) {
            throw new IllegalArgumentException(DUPLICATE_LINE_NAME_EXCEPTION);
        }
    }

    private static void validateLineNameLength(String lineName) {
        if (lineName.length() < 2) {
            throw new IllegalArgumentException(LINE_NAME_LENGTH_EXCEPTION);
        }
    }

    public static void validateExistingLine (String lineName) {
        if (!StationRepository.checkExistsByName(lineName)){
            throw new IllegalArgumentException(NOT_EXISTING_LINE_NAME_EXCEPTION);
        }
    }
}
