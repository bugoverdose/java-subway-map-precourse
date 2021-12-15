package subway.view;

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
}
