package week_7.class_activity_1;

public class ThreadStateEx implements Runnable{

    @Override
    public void run() {
        try{
            // moving thread t2 to the state timed waiting
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -" + ThreadState.t1.getState());

        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
