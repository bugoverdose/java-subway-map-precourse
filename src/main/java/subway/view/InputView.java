package subway.view;

import java.util.Scanner;

public class InputView {

    public static String requestMainMenuAction() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("## 메인 화면\n" +
                "1. 역 관리\n" +
                "2. 노선 관리\n" +
                "3. 구간 관리\n" +
                "4. 지하철 노선도 출력\n" +
                "Q. 종료");
        String userChoice = scanner.next();
        scanner.close();
        return userChoice;
    }

    public static String requestStationMenuAction() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("## 역 관리 화면\n" +
                "1. 역 등록\n" +
                "2. 역 삭제\n" +
                "3. 역 조회\n" +
                "B. 돌아가기");
        String userChoice = scanner.next();
        scanner.close();
        return userChoice;
    }
}
