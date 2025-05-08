package advanced.ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream.of(intArray)
                .asDoubleStream()
                .forEach(d -> System.out.println(d));

        IntStream.of(intArray)
                .forEach(n -> System.out.println(n));
    }
}
