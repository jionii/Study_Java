package advanced.ch01.sec02;

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 줄 수
            for (int j = 1; j <= i; j++) { // 별 개수
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
