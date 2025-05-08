package basic.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나" };
        int[] intArray = { 1, 2, 3, 4, 5 };

        // 문자열 배열 스트림 출력
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(s -> System.out.print(s + ","));

        System.out.println(); // 줄바꿈

        // 정수 배열 스트림 출력
//        IntStream intStream = Arrays.stream(intArray);
//        intStream.forEach(n -> System.out.print(n + ","));
    }
}
