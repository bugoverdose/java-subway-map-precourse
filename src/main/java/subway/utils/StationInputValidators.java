package subway.utils;

import subway.domain.Station;
import subway.domain.StationRepository;

import static subway.constants.Constants.NAME_MIN_LENGTH;
import static subway.constants.ExceptionMessages.*;

public class StationInputValidators {

    public static void validatePostStation (String stationName) {
        validateUniqueStationName(stationName);
        validateStationNameLength(stationName);
    }

    private static void validateUniqueStationName (String stationName) {
        if (StationRepository.checkExistsByName(stationName)){
            throw new IllegalArgumentException(DUPLICATE_STATION_NAME_EXCEPTION);
        }
    }

    private static void validateStationNameLength (String stationName) {
        if (stationName.length() < NAME_MIN_LENGTH){
            throw new IllegalArgumentException(STATION_NAME_LENGTH_EXCEPTION);
        }
    }

    public static void validateDeleteStation (String stationName) {
        validateExistingStation(stationName);
        validateStationNotSection(stationName);
    }

    public static void validateExistingStation (String stationName) {
        if (!StationRepository.checkExistsByName(stationName)){
            throw new IllegalArgumentException(NOT_EXISTING_STATION_NAME_EXCEPTION);
        }
    }

    private static void validateStationNotSection (String stationName) {
        Station station = StationRepository.findByName(stationName);
        if (station.getIsSection()){
            throw new IllegalArgumentException(STATION_IS_SECTION_EXCEPTION);
        }
    }
}
