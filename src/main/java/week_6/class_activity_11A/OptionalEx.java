package week_6.class_activity_11A;

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        String[] num = new String[10];
//
//        String low = num[5].toLowerCase();

        // 11A1
         Optional<String> checkSum = Optional.ofNullable(num[5]);


        if(checkSum.isPresent()){
            String low = num[5].toLowerCase();
            System.out.println(low);
        }else {
            System.out.println("String value is not present");
        }



       // System.out.println(low);
    }
}
