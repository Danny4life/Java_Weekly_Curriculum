package week_7.class_activity_2;

public class ThreadEx1 extends Thread{
    // the run method is used to do an action for the thread

//    @Override
//    public void run() {
//        System.out.println("Thread is currently running!");
//    }


    @Override
    public void run() {
        System.out.println("Thread is currently running!");
    }

    public static void main(String[] args) {
        ThreadEx1 threadEx1 = new ThreadEx1();

        // the start method is used to start the execution of the thread
        threadEx1.start();
    }
}
