package advanced.ch01.sec03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받는 도구 생성

        int saved = 0; // 저장할 변수를 선언해줘야함

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print("선택> ");
            int num = sc.nextInt();


            if (num == 1) {
                System.out.print("예금액> ");
                int account = sc.nextInt();
                saved += account;
                System.out.println("예금됐습니다!");
            } else if (num == 2) {
                System.out.print("출금액> ");
                int num2 = sc.nextInt();
                if (saved - num2 > 0) {
                    saved -= num2;
                    System.out.println("출금되었습니다!");
                } else {
                    System.out.println("잔고가 부족합니다. 다시 처음부터 입력해주세요.");
                }
            } else if (num == 3) {
                System.out.println("잔고>"+saved);
            } else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
