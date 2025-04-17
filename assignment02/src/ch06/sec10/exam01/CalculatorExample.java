package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {

        double pi = Calculator.PI;

        System.out.println(pi);

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
        // final 쓰면 이 코드 안 됨
//        cal1.PI = 15;


        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);

        System.out.println("cal2.PI : " + cal2.PI);

        Calculator cal = new Calculator();

        // 인스턴스를 만들지 않아도 클래스이름."" 으로 참조 할 수 있음
//        System.out.println(Calculator.plus((int)pi, 5));
    }
}
