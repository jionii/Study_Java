package ch07.sec03.exam02;

public class Phone {
    // public으로 선언해서 phone.model 같이 직접 접근 가능
    public String model;
    public String color;

    // 이게 기본 생성자
    public Phone() {
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }

    public void printModel() {
        System.out.println("부모(Phone)에서 호출됨.. model = " + model);
    }
}
