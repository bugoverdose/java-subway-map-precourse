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
        StringBuilder sb = new StringBuilder();

        sb.append(READ_STATION_LIST_FORMAT);
        for (Station station : stationList) {
            sb.append(INFO).append(station.getName());
        }

        System.out.println(sb);
    }

    public static void printPostLineOutput() {
        System.out.println(POST_LINE_SUCCESSFUL_OUTPUT);
    }

    public static void printDeleteLineOutput() {
        System.out.println(DELETE_LINE_SUCCESSFUL_OUTPUT);
    }

    public static void printReadLineOutput(List<Line> lineList) {
        StringBuilder sb = new StringBuilder();

        sb.append(READ_LINE_LIST_FORMAT);
        for (Line line : lineList) {
            sb.append(INFO).append(line.getName());
        }

        System.out.println(sb);
    }

    public static void printPostSectionOutput() {
        System.out.println(POST_SECTION_SUCCESSFUL_OUTPUT);
    }

    public static void printDeleteSectionOutput() {
        System.out.println(DELETE_SECTION_SUCCESSFUL_OUTPUT);
    }

    public static void printReadAllLinesOutput(List<Line> lineList) {
        StringBuilder sb = new StringBuilder();

        System.out.println(READ_ALL_LINES_FORMAT);
        for (Line line : lineList) {
            sb.append(INFO).append(line.getSections()).append(LINES);
            for (Station section : line.getSections()) {
                sb.append(INFO).append(section.getName());
            }
            sb.append(BLANK_LINE);
        }

        System.out.println(sb);
    }
}
