package basic.ch02.sec08;

public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);
        // "문자열" + 숫자 => 모든 게 문자열로 변환돼서 이어 붙여짐
        // "10" + 2 => 2도 문자열로 바뀌어서 붙여짐 : "102"
        // "102" + 8 => 다시 문자열 + 숫자 : "1028"

        String result5 = "10" + (2 + 8); // 괄호 먼저 계산
        System.out.println("result5: " + result5);
    }
}
