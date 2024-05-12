package week_3.class_activity_12A.class_exercise;

public class ExerciseOne {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0;
        int num3;

        try{
            num3 = num1 / num2;
        }catch (Exception e){
            System.out.println(num1/(num2+2));
        }


        // do this to show the exception after
//        num3 = num1 / num2;
//        System.out.println(num3 + 2);
    }
}
