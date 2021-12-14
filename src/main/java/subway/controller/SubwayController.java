package subway.controller;

import java.util.Scanner;

public class SubwayController {

    public SubwayController() {}

    public void run() {
        while (true) {
            final Scanner scanner = new Scanner(System.in);
            System.out.println("## 메인 화면\n" +
                    "1. 역 관리\n" +
                    "2. 노선 관리\n" +
                    "3. 구간 관리\n" +
                    "4. 지하철 노선도 출력\n" +
                    "Q. 종료");
            String userChoice = scanner.next();
            if (userChoice.equals("Q")) break;
            if (userChoice.equals("1")) {
                //TODO
            }
            if (userChoice.equals("2")) {
                //TODO
            }
            if (userChoice.equals("3")) {
                //TODO
            }
            if (userChoice.equals("4")) {
                //TODO
            }
        }
    }
}
