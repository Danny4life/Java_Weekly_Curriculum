package week_6.class_activity_2A;

public class WithLambdaExpression {

    public static void main(String[] args) {

        SayName s1 = (name) -> "Hello, " + name;
        System.out.println(s1.sayName("JOHN"));

    }
}
