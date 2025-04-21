package ch07.sec03.exam02;

public class SmartPhone extends Phone{

    // public SmartPhone() {
    //     super(); // <- Phone클래스(부모클래스)에 기본 생성자가 없으면 이건 에러 남!
    // }

    public SmartPhone(String model, String color) {
        // 자식 생성자에서는 부모 생성자를 무조건 호출
        // 부모 필드를 호출하려면, 부모 생성자가 그 필드를 매개변수로 받아야 하고
        // 자식 생성자에서 "super(필드에 대한 값)"을 호출해야함
        // 자식 생성자에서 부모 생성자는 무조건 첫 줄에 호출돼야 함
        super(model, color);
        System.out.println("SmartPhone 생성자 호출됨..");
    }

    /*
    * 메서드 재정의(Overriding)
    * - 부모가 가지는 메서드 선언부를 그대로 사용하면서
    * - 자식 클래스에서 정의한 메서드대로 동작하도록 다시 작성
    *
    * 오버라이딩의 성립 요건
    * - 메서드 이름, 리턴 타입, 매개변수의 타입, 갯수, 순서가 동일해야 한다.
    * - private 메서드는 접근 불가하기 때문에 불가능
    * - final 메서드도 오버라이딩 불가
    * - 접근제어자 부모 메서드와 같거나 더 넓은 범위
    * - 예외처리 같은 예외거나 더 구체적인(하위) 예외 처리
    * */

    @Override // 컴파일시 정확히 오버라이딩 되었는지 체크해줌
    public void printModel() {
        // 자식 클래스 안에서 부모의 메서드를 호출하고 싶다면 super.메서드이름()
        super.printModel();
    }
}
