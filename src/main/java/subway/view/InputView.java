package subway.view;

import static subway.constants.InstructionMessages.*;

import java.util.Scanner;

public class InputView {

    private static String requestUserInput() {
        final Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        scanner.close();
        return userChoice;
    }

    public static String requestActionInput() {
        System.out.println(REQUEST_ACTION_INPUT);
        return requestUserInput();
    }

    public static String requestNewStationInput() {
        System.out.println(REQUEST_NEW_STATION_INPUT);
        return requestUserInput();
    }

    public static String requestDeleteStationInput() {
        System.out.println(REQUEST_DELETE_STATION_INPUT);
        return requestUserInput();
    }

    public static String requestNewLineInput() {
        System.out.println(REQUEST_NEW_LINE_INPUT);
        return requestUserInput();
    }

    public static String requestNewLineStartStationInput() {
        System.out.println(REQUEST_NEW_LINE_START_STATION_INPUT);
        return requestUserInput();
    }

    public static String requestNewLineEndStationInput() {
        System.out.println(REQUEST_NEW_LINE_END_STATION_INPUT);
        return requestUserInput();
    }
}