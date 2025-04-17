package advanced.ch01.sec03;

public class ArraySumExample {
    public class ArraySumAverage {
        public static void main(String[] args) {
            int [][] array = {
                    { 95, 86 },
                    { 83, 92, 96 },
                    { 78, 83, 93, 87, 88 }
            };

            int sum = 0;
            int count = 0;

            // 중첩 for문: 바깥은 행(row), 안쪽은 열(column)
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];  // 총합 계산
                    count++;             // 전체 원소 개수
                }
            }

            double average = (double) sum / count;

            System.out.println("합계: " + sum);
            System.out.println("평균: " + average);
        }
    }
}
