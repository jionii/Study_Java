package basic.ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개인 람다식
        person.action((x, y) -> {
            System.out.println("결과: " + (x + y));
            return x + y;
        });

        // sum() 메서드 호출하는 람다식
        person.action((x, y) -> {
            return sum(x, y);
        });
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
