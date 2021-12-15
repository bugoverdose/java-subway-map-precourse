package subway.constants;

public class InstructionMessages {

    public static String REQUEST_ACTION_INPUT = "## 원하는 기능을 선택하세요.";

    public static String REQUEST_MAIN_ACTION = "## 메인 화면\n" +
            "1. 역 관리\n" +
            "2. 노선 관리\n" +
            "3. 구간 관리\n" +
            "4. 지하철 노선도 출력\n" +
            "Q. 종료\n";

    public static String REQUEST_STATION_MENU_ACTION = "## 역 관리 화면\n" +
            "1. 역 등록\n" +
            "2. 역 삭제\n" +
            "3. 역 조회\n" +
            "B. 돌아가기\n";

    public static String REQUEST_LINE_MENU_ACTION = "## 노선 관리 화면\n" +
            "1. 노선 등록\n" +
            "2. 노선 삭제\n" +
            "3. 노선 조회\n" +
            "B. 돌아가기\n";

    public static String REQUEST_SECTION_MENU_ACTION = "## 구간 관리 화면\n" +
            "1. 구간 등록\n" +
            "2. 구간 삭제\n" +
            "B. 돌아가기\n";

    public static String REQUEST_NEW_STATION_INPUT = "## 등록할 역 이름을 입력하세요.";
    public static String REQUEST_DELETE_STATION_INPUT = "## 삭제할 역 이름을 입력하세요.";
    public static String REQUEST_NEW_LINE_INPUT = "## 등록할 노선 이름을 입력하세요.";
    public static String REQUEST_NEW_LINE_START_STATION_INPUT = "## 등록할 노선의 상행 종점역 이름을 입력하세요.";
    public static String REQUEST_NEW_LINE_END_STATION_INPUT = "## 등록할 노선의 하행 종점역 이름을 입력하세요.";
    public static String REQUEST_DELETE_LINE_INPUT = "## 삭제할 노선 이름을 입력하세요.";
    public static String REQUEST_TARGET_LINE_INPUT = "## 노선을 입력하세요.";
    public static String REQUEST_STATION_LINE_INPUT = "## 역이름을 입력하세요.";
    public static String REQUEST_SECTION_IDX_INPUT = "## 순서를 입력하세요.";
    public static String REQUEST_DELETE_SECTION_LINE_INPUT = "## 삭제할 구간의 노선을 입력하세요.";
    public static String REQUEST_DELETE_SECTION_STATION_INPUT = "## 삭제할 구간의 역을 입력하세요.";
}
