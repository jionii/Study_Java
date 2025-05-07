package advanced.ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 생성자 참조 (1개 매개변수)
        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();

        // 생성자 참조 (2개 매개변수)
        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
