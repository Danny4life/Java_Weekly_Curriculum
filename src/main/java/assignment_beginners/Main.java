package assignment_beginners;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();


        System.out.println("Addition: " + cal.addition(5,3));
        System.out.println("Subtraction: " + cal.subtraction(7,4));
        System.out.println("Multiplication: " + cal.multiplication(6,2));
        System.out.println("Division: " + cal.division(10,2));
        System.out.println("Division by zero: " + cal.division(10,0));
    }
}
