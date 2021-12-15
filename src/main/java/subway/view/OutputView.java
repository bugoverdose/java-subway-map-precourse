package subway.view;

import subway.domain.Line;
import subway.domain.Station;

import java.util.List;

import static subway.constants.OutputMessages.*;

public class OutputView {

    public static void printPostStationOutput() {
        System.out.println(POST_STATION_SUCCESSFUL_OUTPUT);
    }

    public static void printDeleteStationOutput() {
        System.out.println(DELETE_STATION_SUCCESSFUL_OUTPUT);
    }

    public static void printReadStationOutput(List<Station> stationList) {
        System.out.println(READ_STATION_LIST_FORMAT);
        for (Station station : stationList) {
            System.out.println(INFO + station.getName());
        }
    }

    public static void printPostLineOutput() {
        System.out.println(POST_LINE_SUCCESSFUL_OUTPUT);
    }

    public static void printDeleteLineOutput() {
        System.out.println(DELETE_LINE_SUCCESSFUL_OUTPUT);
    }

    public static void printReadLineOutput(List<Line> lineList) {
        System.out.println(READ_LINE_LIST_FORMAT);
        for (Line line : lineList) {
            System.out.println(INFO + line.getName());
        }
    }

    public static void printPostSectionOutput() {
        System.out.println(POST_SECTION_SUCCESSFUL_OUTPUT);
    }

    public static void printDeleteSectionOutput() {
        System.out.println(DELETE_SECTION_SUCCESSFUL_OUTPUT);
    }

    public static void printReadAllLinesOutput(List<Line> lineList) {
        System.out.println(READ_ALL_LINES_FORMAT);
        for (Line line : lineList) {
            System.out.println(INFO + line.getSections());
            System.out.println(LINES);
            for (Station section : line.getSections()) {
                System.out.println(INFO + section.getName());
            }
            System.out.println(BLANK_LINE);
        }
    }
}
