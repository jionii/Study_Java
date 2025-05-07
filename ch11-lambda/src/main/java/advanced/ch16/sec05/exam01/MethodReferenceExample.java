package advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메서드 참조
        person.action(Computer::staticMethod);

        // 인스턴스 메서드 참조
        Computer com = new Computer();
        person.action(com::instanceMethod);
    }
}
