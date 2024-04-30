package week_3.class_activity_2A;

public class OverLoadingEx {

    // make ths field static so we can call it from any class
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
}
