package advanced.ch01.sec03;

public class MaxValueExample {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };

        int max = array[0]; // 첫 번째 요소를 초기값으로 설정

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 더 큰 값을 max에 저장
            }
        }

        System.out.println("최대값: " + max);
    }
}
