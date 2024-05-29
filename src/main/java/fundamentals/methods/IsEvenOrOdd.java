package fundamentals.methods;

public class IsEvenOrOdd {

    public static void isEvenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public String myName(String name){
        return name;
    }
    public static void main(String[] args) {
        isEvenOrOdd(10);

        sum(5, 5);

        System.out.println(add(10, 10));
    }
}
