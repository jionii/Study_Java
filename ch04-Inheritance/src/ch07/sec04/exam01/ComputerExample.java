package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Computer computer = new Computer();

        double result1 = calc.areaCircle(10);
        double result2 = computer.areaCircle(10);

        System.out.println("Calculator 결과: " + result1);
        System.out.println("Computer 결과: " + result2);

    }
}
