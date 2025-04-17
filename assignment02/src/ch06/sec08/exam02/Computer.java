package ch06.sec08.exam02;

public class Computer {
    int sum(int... values) {
        int total = 0;
        for (int v : values) {
            total += v;
        }
        return total;
    }
}
