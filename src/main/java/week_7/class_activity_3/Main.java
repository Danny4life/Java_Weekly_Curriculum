package week_7.class_activity_3;

public class Main {
    public static void main(String[] args) {
        // Creating two threads to print numbers concurrently
        Thread t1 = new Thread(new NumberPrinter(1,5), "Thread-1");
        Thread t2 = new Thread(new NumberPrinter(6,10), "Thread-2");

        // Starting the threads
        t1.start();
        t2.start();
    }
}
