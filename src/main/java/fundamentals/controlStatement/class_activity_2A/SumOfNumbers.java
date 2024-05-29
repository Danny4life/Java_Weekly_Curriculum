package fundamentals.controlStatement.class_activity_2A;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 0;

        for(int i = 1; i <= 5; i++){
            n = n + i;
            // n += i;



//          break it down
//            0 = 0 +  i = 1;
//          n =  1 = 1 + i = 2;
//          n =  3 = 3 + i = 3;
//          n =  6 = 6 + i = 4;
//          n =  10 = 10 + i = 5 = 15
            // i = 6 = false

            /**
             * Summary
             * The loop effectively adds the numbers from 1 to 5 to the variable n. The process is:
             *
             * n starts at 0
             * Add 1 (now n = 1)
             * Add 2 (now n = 3)
             * Add 3 (now n = 6)
             * Add 4 (now n = 10)
             * Add 5 (now n = 15)
             */


        }
        System.out.println(n);

    }
}


