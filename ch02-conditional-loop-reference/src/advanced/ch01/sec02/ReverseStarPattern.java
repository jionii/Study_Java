package advanced.ch01.sec02;

public class ReverseStarPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // 줄 수 (5줄 → 1줄까지 감소)
            for (int j = 1; j <= i; j++) { // 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
