package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static subway.constants.ExceptionMessages.NOT_EXISTING_STATION_NAME_EXCEPTION;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static Station findByName(String name) {
        for (Station station : stations) {
            if (!station.getName().equals(name)) continue;
            return station;
        }
        throw new IllegalArgumentException(NOT_EXISTING_STATION_NAME_EXCEPTION);
    }

    public static boolean checkExistsByName(String name) {
        for (Station station : stations) {
            if (!station.getName().equals(name)) continue;
            return true;
        }
        return false;
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static void initDatabase() {
        List<String> initialStations = Stream.of("교대역", "강남역", "역삼역", "남부터미널역", "양재역", "양재시민의숲역", "매봉역")
                .collect(Collectors.toList());
        for (String stationName : initialStations) {
            addStation(new Station(stationName));
        }
    }

    public static void updateIsSection(Station station) {
        station.setIsSection(checkIsSection(station));
    }

    private static boolean checkIsSection(Station station) {
        for (Line line : LineRepository.lines()) {
            if (line.getSections().contains(station)) return true;
        }
        return false;
    }
}
