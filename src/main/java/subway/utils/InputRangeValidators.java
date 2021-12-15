package subway.utils;

import subway.domain.Line;

import static subway.constants.Constants.*;
import static subway.constants.ExceptionMessages.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputRangeValidators {

    public static void validateMainMenuInput(String input) {
        List<String> validateInputs = Stream.of(ONE, TWO, THREE, FOUR, EXIT_Q)
                .collect(Collectors.toList());
        if (!validateInputs.contains(input)) {
            throw new IllegalArgumentException(INVALID_CHOICE_EXCEPTION);
        }
    }

    public static void validateStationMenuInput(String input) {
        List<String> validateInputs = Stream.of(ONE, TWO, THREE, EXIT_B)
                .collect(Collectors.toList());
        if (!validateInputs.contains(input)) {
            throw new IllegalArgumentException(INVALID_CHOICE_EXCEPTION);
        }
    }

    public static void validateLineMenuInput(String input) {
        List<String> validateInputs = Stream.of(ONE, TWO, THREE, EXIT_B)
                .collect(Collectors.toList());
        if (!validateInputs.contains(input)) {
            throw new IllegalArgumentException(INVALID_CHOICE_EXCEPTION);
        }
    }

    public static void validateSectionMenuInput(String input) {
        List<String> validateInputs = Stream.of(ONE, TWO, EXIT_B)
                .collect(Collectors.toList());
        if (!validateInputs.contains(input)) {
            throw new IllegalArgumentException(INVALID_CHOICE_EXCEPTION);
        }
    }

    public static int validateAndParseToInt(String input, Line line) {
        int idx = validateAndParseToInt(input);
        validateLineRange(idx, line);
        return idx;
    }

    private static int validateAndParseToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NOT_INTEGER_EXCEPTION);
        }
    }

    private static void validateLineRange(int idx, Line line) {
        if (idx < SECTION_MIN_IDX || idx > line.getSectionSize() + 1) {
            throw new IllegalArgumentException(INVALID_RANGE_EXCEPTION);
        }
    }
}