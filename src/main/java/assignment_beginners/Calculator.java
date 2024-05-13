package assignment_beginners;

public class Calculator {

    public int addition(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public double division(double a, double b){

        if(b == 0){
            System.out.println("Cannot be divided by zero");
            return Double.NaN;
        }else {
            return a / b;
        }

    }

}
