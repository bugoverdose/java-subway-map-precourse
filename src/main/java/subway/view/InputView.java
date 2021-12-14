package subway.view;

import static subway.constants.InstructionMessages.*;

import java.util.Scanner;

public class InputView {

    public static String requestUserInput() {
        System.out.println(REQUEST_USER_INPUT);
        final Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        scanner.close();
        return userChoice;
    }
}