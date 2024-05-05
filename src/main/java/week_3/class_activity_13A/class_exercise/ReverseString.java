package week_3.class_activity_13A.class_exercise;

public class ReverseString {
    public static String reverseString(String input){
        StringBuffer sb = new StringBuffer(input);


        sb.reverse();

        return sb.toString();
    }


    public static void main(String[] args) {
        String result = reverseString("Hello");

        System.out.println(result);
    }
}
