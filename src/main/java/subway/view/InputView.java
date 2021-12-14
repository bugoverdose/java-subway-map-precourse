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
}
