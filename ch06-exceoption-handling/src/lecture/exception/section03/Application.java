package lecture.exception.section03;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        // BufferedReader : 파일을 읽어오는 클래

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("hello.txt"));

            String s;

            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
            // catch 블럭을 여러 개 작성할 때
            // 상위 타입이 하단에 오고 후손 타입이 상단에 온다
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생!");
        } catch (IOException e) {
            System.out.println("IO Exception 발생!");
        }
    }
}
