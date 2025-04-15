package advanced.ch02.sec11;

// 사다리꼴 넓이 구하기
public class TrapezoidAreaCalculator {
    public static void main(String[] args) {
        int baseBottom = 10;
        int baseTop = 5;
        int height = 7;

        double area = (baseTop + baseBottom) * height/2;
        System.out.println("사다리꼴의 넓이: " + area);
    }
}
