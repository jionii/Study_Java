package advance.ch15.sec02.exam03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Vue");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
