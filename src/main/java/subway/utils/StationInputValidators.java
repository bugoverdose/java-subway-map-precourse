package subway.utils;

import static subway.constants.ExceptionMessages.*;
import static subway.domain.StationRepository.*;

public class StationInputValidators {

    public static void validatePostStation (String stationName) {
        validateUniqueStationName(stationName);
        validateStationNameLength(stationName);
    }

    private static void validateUniqueStationName (String stationName) {
        if (checkExistsByName(stationName)){
            throw new IllegalArgumentException(DUPLICATE_STATION_NAME_EXCEPTION);
        }
    }

    private static void validateStationNameLength (String stationName) {
        if (stationName.length() < 2){
            throw new IllegalArgumentException(STATION_NAME_LENGTH_EXCEPTION);
        }
    }

    public static void validateDeleteStation (String stationName) {
        validateExistingStation(stationName);
    }

    private static void validateExistingStation (String stationName) {
        if (!checkExistsByName(stationName)){
            throw new IllegalArgumentException(NOT_EXISTING_STATION_NAME_EXCEPTION);
        }
    }
}
