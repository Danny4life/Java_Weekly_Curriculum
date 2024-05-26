package week_6.class_activity_6A;

public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello this is a static method");
    }

    public static void main(String[] args) {
        SayAble sayAble = MethodReference::saySomething;

        sayAble.say();
    }
}
