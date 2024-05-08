package week_3.class_activity_15A;

public class SplitEx {
    public static void main(String[] args) {
        String s1 = "this is a java split method example";

        System.out.println("before spliting : " + s1);
        System.out.println("********after splitting******");
        String[] words = s1.split("\\s"); // split the string based on white space
        // using foreach loop to print element of the string array

        for(String w : words){
            System.out.println(w);
        }
    }
}
