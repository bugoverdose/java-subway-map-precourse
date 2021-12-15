package subway.utils;

import static subway.constants.ExceptionMessages.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuInputValidators {

    public static void validateMainMenuInput(String input) {
        List<String> validateInputs = Stream.of("1", "2", "3", "4", "Q")
                                            .collect(Collectors.toList());
        if (!validateInputs.contains(input)){
            throw new IllegalArgumentException(INVALID_CHOICE_EXCEPTION);
        }
    }
}
