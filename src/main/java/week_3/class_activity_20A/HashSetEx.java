package week_3.class_activity_20A;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("orange");
        set1.add("banana");
        set1.add("pawpaw");
        set1.add("kiwi");
        set1.add("kiwi"); //use to show that it can not contains duplicate items and does not maintain insertion order

        System.out.println(set1);

        // also show example using for-each loop
    }
}
