package advanced.ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value); // 그냥 출력
        System.out.printf("상품의 가격: %d원\n", value); // 공백 추가
        System.out.printf("상품의 가격:%d원\n", value); // 공백 없음
        System.out.printf("상품의 가격:%06d원\n", value); // 6자리로 맞추고 0으로 채움

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %.2f\n", 10, area); // 소수점 둘째자리까지

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%d | %s | %s\n", 1, name, job); // 번호 | 이름 | 직업
    }
}
