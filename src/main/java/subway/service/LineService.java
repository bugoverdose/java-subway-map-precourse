package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import static subway.constants.InstructionMessages.*;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;

public class LineService {
    public void run() {
        System.out.println(REQUEST_LINE_MENU_ACTION);
        boolean isSuccessful = false;
        while (!isSuccessful) {
            String userChoice = requestActionInput();
            if (userChoice.equals("1")) {
                isSuccessful = postLineSuccessful();
            }
            if (userChoice.equals("2")) {
                isSuccessful = deleteLineSuccessful();
            }
            if (userChoice.equals("3")) {
                isSuccessful = readLineSuccessful();
            }
            if (userChoice.equals("B")) break;
        }
    }

    private boolean postLineSuccessful() {
        try {
            String name = requestNewLineInput();
            Station startStation = StationRepository.findByName(requestNewLineStartStationInput());
            Station endStation = StationRepository.findByName(requestNewLineEndStationInput());
            Line newLine = new Line(name, startStation, endStation);
            LineRepository.addLine(newLine);
            printPostLineOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteLineSuccessful() {
        try {
            String lineName = requestDeleteLineInput();
            LineRepository.deleteLineByName(lineName);
            printDeleteLineOutput();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean readLineSuccessful() {
        printReadLineOutput(LineRepository.lines());
        return true;
    }

    public void readAllLines() {
        printReadAllLinesOutput(LineRepository.lines());
    }
}
