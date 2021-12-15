package subway.constants;

public class ExceptionMessages {

    public static String ERROR = "[ERROR] ";
    public static String INVALID_CHOICE_EXCEPTION = ERROR + "선택할 수 없는 기능입니다.\n";
    public static String DUPLICATE_STATION_NAME_EXCEPTION = ERROR + "이미 존재하는 역 이름입니다.\n";
    public static String STATION_NAME_LENGTH_EXCEPTION = ERROR + "역 이름은 두 글자 이상이어야 합니다.\n";
    public static String NOT_EXISTING_STATION_NAME_EXCEPTION = ERROR + "존재하지 않는 역 이름입니다.\n";
    public static String STATION_IS_SECTION_EXCEPTION = ERROR + "구간으로 등록된 역은 삭제할 수 없습니다.\n";
    public static String DUPLICATE_LINE_NAME_EXCEPTION = ERROR + "이미 존재하는 노선 이름입니다.\n";
    public static String LINE_NAME_LENGTH_EXCEPTION = ERROR + "노선 이름은 두 글자 이상이어야 합니다.\n";
    public static String NOT_EXISTING_LINE_NAME_EXCEPTION = ERROR + "존재하지 않는 노선 이름입니다.\n";
}
