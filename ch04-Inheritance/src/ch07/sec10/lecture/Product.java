package ch07.sec10.lecture;

public abstract class Product {

    // 필드 선언 가능
    private int nonStaticField;
    private static int staticField;

    // 생성자도 가질 수는 있음
    public Product() {
    }

    public abstract void abstMethod();

    public void nonStaticMethod() {
        System.out.println("추상 클래스 안의 nonStaticMethod() 호출 됨!");
    }

    public static void StaticMethod() {
        System.out.println("추상 클래스 안의 StaticMethod() 호출 됨!");
    }
}
