package ch07.sec04.exam01;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        return Math.PI * r * r; // 부모 메서드를 부를 필요 없음 -> 왜? -> 메서드 로직을 바꿀거니까
        // 그럼 부모 메서드를 호출하는 상황은 언제야?
        // 1. 부모의 기능도 사용하고, 내 기능도 추가하고 싶을 때
        // 2. 부모 메서드를 부분적으로만 변경하고 싶을 때
        // 3. 부모 메서드를 조건적으로 호출하고 싶을 때
    }
}
