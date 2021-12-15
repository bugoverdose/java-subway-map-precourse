package subway.utils;

import static subway.constants.ExceptionMessages.*;
import static subway.domain.StationRepository.*;

public class StationInputValidators {

    public static void validateUniqueStationName (String stationName) {
        if (checkExistsByName(stationName)){
            throw new IllegalArgumentException(DUPLICATE_STATION_NAME_EXCEPTION);
        }
    }
}
