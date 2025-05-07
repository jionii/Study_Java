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

    /*
    * 메서드 참조
    * 함수형 인터페이스를 람다식으로 쓰는 게 아닌, 일반 메서드를 참조시켜 선언하는 방법
    * 일반 메서드를 참조하기 위한 조건
    * 각 메서드의 매개변수 타입/갯수/반환형이 같아야 함
    *
    * // static
    * 클래스이름::메서드이름
    *
    * // instance
    * 참조변수이름::메서드이름
    * */

    public static double sum(double x, double y) {
        return (x + y);
    }
}
