package ch06.sec07.exam04;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 디폴트 생성자
    public Car() {}

    // model 생성자
    public Car(String model) {
        this.model = model;
    }

    // model, color 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // model, color, maxSpeed 생성자
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
