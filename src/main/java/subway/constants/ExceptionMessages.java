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
    public static String NOT_INTEGER_EXCEPTION = ERROR + "노선 내 위치로 숫자를 입력해야 합니다.\n";
    public static String INVALID_RANGE_EXCEPTION = ERROR + "노선 내 위치로는 1부터 노선 맨 끝의 위치를 값으로 입력해야 합니다.\n";
    public static String NOT_A_SECTION_IN_THE_LINE_EXCEPTION = ERROR + "해당 노선의 구간으로 등록된 역이 아닙니다.\n";
    public static String SECTION_LENGTH_EXCEPTION = ERROR + "노선의 구간은 2개 이하가 될 수 없습니다.\n";

}
