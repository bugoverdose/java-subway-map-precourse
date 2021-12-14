package subway.constants;

public class InstructionMessages {

    public static String REQUEST_ACTION_INPUT = "## 원하는 기능을 선택하세요.\n";

    public static String REQUEST_MAIN_ACTION = "## 메인 화면\n" +
            "1. 역 관리\n" +
            "2. 노선 관리\n" +
            "3. 구간 관리\n" +
            "4. 지하철 노선도 출력\n" +
            "Q. 종료";

    public static String REQUEST_STATION_MENU_ACTION = "## 역 관리 화면\n" +
            "1. 역 등록\n" +
            "2. 역 삭제\n" +
            "3. 역 조회\n" +
            "B. 돌아가기";

    public static String REQUEST_NEW_STATION_INPUT = "## 등록할 역 이름을 입력하세요.\n";
    public static String REQUEST_DELETE_STATION_INPUT = "## 삭제할 역 이름을 입력하세요.\n";
}
