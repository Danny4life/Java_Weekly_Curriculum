package fundamentals.controlStatement.class_activity_3A;

public class ContinueEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);

        }
    }
}
