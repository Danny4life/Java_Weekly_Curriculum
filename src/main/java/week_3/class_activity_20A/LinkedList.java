package week_3.class_activity_20A;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list1 = new java.util.LinkedList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        list1.add("fourth");
        list1.add("fifth");
        list1.add("fifth"); // use this to show that it can contain duplicate item


        System.out.println(list1);
    }
}
