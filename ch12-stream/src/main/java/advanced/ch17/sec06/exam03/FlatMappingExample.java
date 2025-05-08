package advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        // 문장 → 단어로 flatMap 처리
        list1.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");

        // 문자열 숫자 목록 → 숫자 스트림
        list2.stream()
                .flatMapToInt(str -> {
                    return Arrays.stream(str.split(","))
                            .map(String::trim)
                            .mapToInt(Integer::parseInt);
                })
                .forEach(System.out::println);
    }
}