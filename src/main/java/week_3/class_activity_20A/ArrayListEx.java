package week_3.class_activity_20A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("five"); // use this to show that it can contain duplicate item

        // to sort the element
        //Collections.sort(list1);

        //to remove element
        //list1.remove(1);


        System.out.println(list1);


//       loop thorough array
//        for(String s : list1){
//            System.out.println(s);
//        }



    }
}
