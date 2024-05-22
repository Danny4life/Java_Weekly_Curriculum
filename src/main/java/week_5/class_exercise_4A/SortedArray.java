package week_5.class_exercise_4A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(50);
        num.add(30);
        num.add(70);
        num.add(40);
        num.add(10);

        Collections.sort(num);

        for(Integer i : num){
            System.out.println(i);
        }
    }
}
