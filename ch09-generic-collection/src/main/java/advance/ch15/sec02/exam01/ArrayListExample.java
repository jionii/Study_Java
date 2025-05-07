package advance.ch15.sec02.exam01;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));

        for (Board board : list) {
            System.out.println(board.getSubject() + " - " + board.getWriter());
        }
    }
}
