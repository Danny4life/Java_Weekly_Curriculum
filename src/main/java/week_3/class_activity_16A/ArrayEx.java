package week_3.class_activity_16A;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // example 1 simple for looping ex
       // int[] numbers = {1,2,3,4,5};

        //use this as first example to get array index, then use the for-each loop to get the element itself

//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(i);
//        }

        // example 2 for sorting
//       int[] numbers = {5,4,3,2,1};
//
//        Arrays.sort(numbers);
//
//       System.out.println(Arrays.toString(numbers));
//


        // ex 3
       // to get the length of an array

        //System.out.println(numbers.length);

        // ex 4 advanced for loop ex to get the element itself
//        for(Integer n : numbers){
//            System.out.println(n);
//        }

        // ex 5 another way of declaring array using totel size
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        //numbers2[5] = 6; // use this to show array index out of bounds



//        for (int j = 0; j < numbers2.length; j++){
//            System.out.println("j : " + j);
//        }

        // ex 6 using advanced for loop

//        for(int n : numbers2){
//            System.out.println(n);
//        }

        // to get the actual numbers and not the index
//        for (int k = 0; k < numbers2.length; k++){
//            System.out.println("k : " + numbers2[k]);
//        }

         // System.out.println("********for each loop******");

         //also show example using for-each loop
//        for(int n : numbers2){
//            System.out.println(n);
//        }
    }
}
