package fundamentals.controlStatement.class_activity_2A;

public class ForLoop2A2 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            // modulo is a mathematical operation that finds the remainder
            //when one integer is divided by another, in other words if you have two integers
            // a and b a % b gives the remainder after dividing a by b
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
