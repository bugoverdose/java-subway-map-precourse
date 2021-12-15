package subway.service;

import static subway.constants.InstructionMessages.*;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;
import static subway.utils.LineInputValidators.*;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class LineService {
    public void run() {
        System.out.println(REQUEST_LINE_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();
            isSuccessful = selectLineMenuAction(userChoice);
        }
    }

    private boolean selectLineMenuAction(String userChoice) {
        if (userChoice.equals("1")) {
            return postLine();
        }
        if (userChoice.equals("2")) {
            return deleteLine();
        }
        if (userChoice.equals("3")) {
            return readLine();
        }
        return userChoice.equals("B");
    }

    private boolean postLine() {
        try {
            String lineName = requestNewLineInput();
            validatePostLine(lineName);
            Station startStation = StationRepository.findByName(requestNewLineStartStationInput());
            Station endStation = StationRepository.findByName(requestNewLineEndStationInput());
            Line newLine = new Line(lineName, startStation, endStation);
            LineRepository.addLine(newLine);
            printPostLineOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteLine() {
        try {
            String lineName = requestDeleteLineInput();
            validateExistingLine(lineName);
            LineRepository.deleteLineByName(lineName);
            printDeleteLineOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean readLine() {
        printReadLineOutput(LineRepository.lines());
        return true;
    }

    public void readAllLines() {
        printReadAllLinesOutput(LineRepository.lines());
    }
}
