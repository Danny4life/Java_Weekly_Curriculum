package fundamentals.methods.class_exercise;

public class MaximumNumber {

    public int maximumNum(int max, int min) {
        return Math.max(max, min);
    }

    public static void show(){
        System.out.println("This is a static method");
    }


    public static void main(String[] args) {
        MaximumNumber max = new MaximumNumber();

        int res = max.maximumNum(20, 10);

        System.out.println(res);

        show();
    }
}
