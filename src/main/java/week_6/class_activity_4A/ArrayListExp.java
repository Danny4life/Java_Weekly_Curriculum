package week_6.class_activity_4A;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
