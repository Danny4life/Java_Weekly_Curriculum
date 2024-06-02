package week_7.class_activity_3;

public class NumberPrinter implements Runnable{

    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try{
                // Simulate some delay
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
